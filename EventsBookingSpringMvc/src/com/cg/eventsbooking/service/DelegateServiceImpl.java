package com.cg.eventsbooking.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cg.eventsbooking.dao.EventRepository;
import com.cg.eventsbooking.dao.EventRepositoryImpl;
import com.cg.eventsbooking.dto.Delegate;
import com.cg.eventsbooking.dto.Event;
import com.cg.eventsbooking.exception.DelegateException;

/** This is the service class.*/  

@Transactional
@Service("delegateservice")
	public class DelegateServiceImpl implements DelegateService
	{
		@Autowired
		EventRepository dao;
//		Map<Delegate,Event> hm = new HashMap<Delegate,Event>();
		
		public Delegate registerDelegate(Delegate delegate) throws DelegateException    //register delegate
		{				
			if(dao.save(delegate)==true)
			return delegate;
			else 
				throw new DelegateException("Delegate not added!");
		}
		public Event registerEvent(Event event) throws DelegateException 	//register event
		{				
			if(dao.saveevent(event)==true)
			return event;
			else 
				throw new DelegateException("event not added!");
		}
		public List<Event> showEvents() throws DelegateException 			//show events
		{	return dao.showAllEvents();	
		}
		public List<Delegate> showDelegates() throws DelegateException		//show delegates
		{	return dao.showAllDelegates();
		}
		public Event eventInfo(Event event) throws DelegateException 		//display details about events
		{	
			List<Event> show=dao.showAllEvents();
			for (Event event2 : show) 
			{
				if(event.getEventName().equals(event2.getEventName())) {
					return event2;
				}
			}
			return null;	
		}
	}