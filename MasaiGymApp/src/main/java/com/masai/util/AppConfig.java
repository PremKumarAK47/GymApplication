package com.masai.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.masai.model.Gym;
import com.masai.model.Person;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySources({
	
	@PropertySource("app.properties"),
})

public class AppConfig {

	@Bean
	public Map<Person,Gym> getMap()
	{
		Map<Person,Gym> themap = new HashMap<>();
		
		themap.put(new Person(1, "Ramu", "ramu@gmail.com", 10, "908090"), new Gym(1, "ramu", 550));
		themap.put(new Person(2, "Kallu", "kallu@gmal.com", 20, "7897987"), new Gym(2, "kallu", 350));
		themap.put(new Person(3, "Hariharan", "hari@gmail.com", 28, "8089687"), new Gym(3, "Hariharan", 320));

		
		return themap;
	}
	
	
	@Bean
	 public List<Person> getList()
	 {
		
		List<Person> theList = new ArrayList<>();
		
		 theList.add(new Person(1, "Ramu", "ramu@gmail.com", 26, "809809"));
		 theList.add(new Person(2, "Kallu", "kallu@gmail.com", 25, "879879090"));
		 theList.add(new Person(3, "Harihan", "hari@gmail.com", 23, "7987000"));
		 theList.add(new Person(4, "NazarAli", "nazar@gmail.com", 24, "7897980"));
		 theList.add(new Person(5, "Kasim", "kasim@gmail.com", 25, "13241654"));
		
		return theList;
	 }
	
}
