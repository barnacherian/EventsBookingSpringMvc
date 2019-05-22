package com.cg.eventsbooking.dao;

import com.cg.eventsbooking.dto.Delegate;
import com.cg.eventsbooking.dto.Event;
import com.cg.eventsbooking.exception.DelegateException;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class EventRepositoryImpl implements EventRepository {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	//List<Delegate> delegateList=new ArrayList<Delegate>();
//	List<Event> eventList =new ArrayList<Event>();
	
	public boolean save(Delegate delegate) {		
		entitymanager.persist(delegate);
		entitymanager.flush();			
		return true;
	}	 
	public List<Event> showAllEvents() {	
		 Query query=entitymanager.createQuery("From Event");
		 List<Event>myList= query.getResultList();
		 
		 return myList;
		
	}
	public List<Delegate> showAllDelegates() {
		Query query=entitymanager.createQuery("From Delegate");
		 List<Delegate>myList= query.getResultList();
		 
		 return myList;
	}
	public boolean saveevent(Event name) throws DelegateException {
		// TODO Auto-generated method stub
		entitymanager.persist(name);
		entitymanager.flush();		
		return true;
	}
}