package com.cg.eventsbooking.service;
import java.util.List;

import com.cg.eventsbooking.dto.Delegate;
import com.cg.eventsbooking.dto.Event;
import com.cg.eventsbooking.exception.DelegateException;

import java.util.List;
public interface DelegateService{	
	Delegate registerDelegate (Delegate delegate) throws DelegateException;
	List<Event>showEvents() throws DelegateException;	
	List<Delegate> showDelegates() throws DelegateException;
	Event eventInfo(Event event) throws DelegateException;
	Event registerEvent(Event event) throws DelegateException;
}
