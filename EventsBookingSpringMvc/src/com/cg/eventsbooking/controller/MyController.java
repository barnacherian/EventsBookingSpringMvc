package com.cg.eventsbooking.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.eventsbooking.dto.Delegate;
import com.cg.eventsbooking.dto.Event;
import com.cg.eventsbooking.exception.DelegateException;
import com.cg.eventsbooking.service.DelegateService;


//This is the controller- handles logic

@Controller
public class MyController {

@Autowired
DelegateService delegateservice; 
Delegate delegate;
	//@RequestMapping(name="login",method=RequestMethod.GET)
	
	@GetMapping("login")
	public String loginPage() {
		return "listpage";
	}
	@GetMapping("listpage")
	public String homePage() {
		return "listpage";
	}	
	
	@PostMapping("checkLogin")
	public String doLogin(@RequestParam("uname") String user,@RequestParam("upass")String pass) {
		System.out.println("Check Login");
		if(user.equals("admin")&& pass.equals("123456")) {
			return "listpage";		
		}else {
			return "error";
		}	
	}	
	@GetMapping("addpage")
	public ModelAndView getAddDelegate(@ModelAttribute("delegate") Delegate del) {
		/*List<String> listofevents=new ArrayList<>();
		listofevents.add("talk show");
		listofevents.add("Sports ");
		listofevents.add("Workshop");*/
		return new ModelAndView("adddelegate");
	}		
	@PostMapping("add")	
	public ModelAndView addDelegate(@ModelAttribute("delegate") Delegate del ) throws DelegateException {
		//System.out.println(pro);
		//Delegate delegate;
	//	delegate = delegateservice.registerDelegate(del);
		//delegate = delegateservice.registerDelegate(del);	
		this.delegate=del;
		System.out.println(delegate);
		return new ModelAndView("delegateevent");
	}	
	
	@PostMapping("assign")
	public ModelAndView addDelegateEvent(@RequestParam("eventName") String name,@RequestParam("date") String eventDate,@RequestParam("city") String eventCity) throws DelegateException {
		//System.out.println(pro);
		Event eventone=new Event();
		eventone.setEventName(name);			
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date=null;
		try {
			date = dateFormat.parse(eventDate);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}		
		eventone.setDate(date);
		eventone.setCity(eventCity);
		List<Event> eventList=new ArrayList<>();
		eventList.add(eventone);
		Delegate dl=new Delegate();
		dl.setDelegateId(delegate.getDelegateId());
		dl.setName(delegate.getName());
		dl.setAddress(delegate.getAddress());
		dl.setEvents(eventList);
		System.out.println("Contoller"+delegate);
		delegateservice.registerDelegate(dl);		
		return new ModelAndView("success");
	}		
	@GetMapping("showpage")
	public ModelAndView showDelegate() throws DelegateException {
		List<Delegate>allDelegates=delegateservice.showDelegates();
		return new ModelAndView("showall", "showdelegate", allDelegates);
	}
	
	@GetMapping("showeventspage")
	public ModelAndView showEventsPage() throws DelegateException {
		List<Event>showallevent=delegateservice.showEvents();
		return new ModelAndView("showallevents", "showevents", showallevent);
	}			
	
	@GetMapping("searchpage")
	public String searchPage() {
		return "search";
	}
	
	@PostMapping("searchpost")
	public ModelAndView showSearchResult(@RequestParam("eventsearch") String name) throws DelegateException {
		Event eve=new Event();
		eve.setEventName(name);
		Event eventSearch=delegateservice.eventInfo(eve);
		return new ModelAndView("searchresult","showeventsearch",eventSearch);
	}	
}