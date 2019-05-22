package com.cg.eventsbooking.dto;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="delegate")
public class Delegate
{
	@Id
	@Column(name="delegate_id")
	private int delegateId;
	@Column(name="delegate_name")
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="delegate",fetch=FetchType.EAGER)
	private List<Event> events;
	public Delegate() {	
	}
	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public Delegate(int delegateId, String name, Address address, List<Event> events) {
		super();
		this.delegateId = delegateId;
		this.name = name;
		this.address = address;
		this.events = events;
	}
	@Override
	public String toString() {
		return "Delegate [delegateId=" + delegateId + ", name=" + name + ", address=" + address + ", events=" + events
				+ "]";
	}

	
	
	
	
	
}