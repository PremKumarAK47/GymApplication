package com.masai.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.service.PersonService;
import com.masai.util.AppConfig;

public class Demo {

	public static void main(String[] args) {
	
	ApplicationContext apctx = new AnnotationConfigApplicationContext(AppConfig.class);
	  
	  PersonService personService  = apctx.getBean("personService", PersonService.class);
	  
	  System.out.println("Application Name-:");
	  personService.printAppName();
	  
	  System.out.println("List -: ");
	  personService.PrintList();
	  
	  System.out.println("Map -: ");
	  personService.PrintMap();
	  
	  
	  
}	
	
}
