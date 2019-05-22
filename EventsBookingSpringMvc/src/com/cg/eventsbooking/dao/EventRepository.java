package com.cg.eventsbooking.dao;

import java.util.List;

import com.cg.eventsbooking.dto.Delegate;
import com.cg.eventsbooking.dto.Event;
import com.cg.eventsbooking.exception.DelegateException;

public interface EventRepository
{
	boolean save(Delegate name) throws DelegateException;
	List<Event> showAllEvents() throws DelegateException;
	List<Delegate> showAllDelegates() throws DelegateException;
	boolean saveevent(Event name) throws DelegateException;
}


