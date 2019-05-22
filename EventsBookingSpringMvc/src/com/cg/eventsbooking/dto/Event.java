package com.cg.eventsbooking.dto;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="event")
public class Event{
	@ManyToOne
	Delegate delegate;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="event_id")
	private int eventId;
	@Column(name="event_name")
	private String eventName;
	@Column(name="event_date")
	private Date date;
	@Column(name="event_city")
	private String city;
	public Event() {}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return eventId;
	}

	public void setId(int id) {
		this.eventId = id;
	}
	public Event(int id, String eventName, Date date, String city) {
		super();
		this.eventId = id;
		this.eventName = eventName;
		this.date = date;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Event [id=" + eventId + ", eventName=" + eventName + ", date=" + date + ", city=" + city + "]";
	}
	
	/*@Override
	public String toString() {
		return "\nEvent [eventName=" + eventName + ", date=" + date.getDate()+"-"+date.getMonth() +"-"+(date.getYear()+1900)+ ", city=" + city + "]";
	}	*/				
}
