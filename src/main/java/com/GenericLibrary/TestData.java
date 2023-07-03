package com.GenericLibrary;

import java.util.Date;
import java.util.Random;

import java.util.stream.IntStream;

import com.github.javafaker.Faker;

public class TestData {
	Faker fk=new Faker();
	
	public String getfirstname()
	{
		String firstName = fk.name().firstName();
		return firstName;
		
	}
	public String getlastName()
	{
		String lastname = fk.name().lastName();
		return lastname;
	}
	public String getEmail()
	{
		String  email = fk.internet().emailAddress();
		return email;
	}
	public String getPhone()
	{
		String phone = fk.phoneNumber().cellPhone();
		return phone;
	}
	public String getAddress()
	{
		String  address = fk.address().fullAddress();
		return address;
	}
	
	public String getCity()
	{
		String  city = fk.address().city();
		return city;
	}
	
	public String getPostalCode() 
	{
		String  postalcode = fk.address().zipCode();
		return postalcode;
	}
	
	public int getID()
	{
		int id = fk.idNumber().hashCode();
		return id;
		
	}
	
		public int getNumber()
		{
			int number = fk.number().numberBetween(01, 99);
			return number;
		}
		public String getDate() {
			Date date = new Date();
			return date.toString();
		}
	}


