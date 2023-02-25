package com.masai.Service;

import java.util.List;
import java.util.Map;

import com.masai.Model.Gym;
import com.masai.Model.Person;

public class PersonService {
	private Map<Person, Gym>theMap;
	// inject 3 entries with valid details 

	private List<Person> theList;
	// inject List of 5 Person object

	private String appName;
	 // inject the AppName from the properties file **[ you can define app name as per your convenience. For Example AppName = “GymApplication” ]**

	//Hint: Make use of @Bean annotation to inject theMap and theList;** 

	public void printMap()
       {

	//print all the person's and their gym details from the Map
       }

	public void printList()
	{

	//sort the List of Person according to the increasing order of the age 

	//print all the sorted Person Details

	}

	public void printAppName(){

	//print the injected appName

	}
}
