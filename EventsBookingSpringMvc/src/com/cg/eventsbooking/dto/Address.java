package com.cg.eventsbooking.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity

@Table(name="address")
@Component
public class Address 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	@Column(name="building")
	private String building;
	@Column(name="street")
	private String street;
	@Column(name="city")
	private String city;
	public Address() {
		// TODO Auto-generated constructor stub
	}	
	public int getId() {
		return addressId;
	}
	public void setId(int id) {
		this.addressId = id;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int id, String building, String street, String city) {
		super();
		this.addressId = id;
		this.building = building;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + addressId + ", building=" + building + ", street=" + street + ", city=" + city + "]";
	}
}