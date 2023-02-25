package com.masai.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.masai.Model.Gym;
import com.masai.Model.Person;



@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySources({
	
	@PropertySource("app.properties"),
})

public class AppConfig {

    @Bean
    Map<com.masai.Model.Person, Gym> getMap()
    {
        Map<Person, Gym> themap = new HashMap<>();

        themap.put(new Person(1, "geeta", "geeta@gmail.com", 10, "777777"), new Gym(1, "geetu", 30));
        themap.put(new Person(2, "govind", "govind@gmal.com", 20, "9999"), new Gym(2, "maya", 40));
        themap.put(new Person(3, "komu", "komu@gmail.com", 28, "8"), new Gym(3, "varun", 50));

        return themap;
    }


    @Bean
    List<Person> getList()
    {

        List<Person> theList = new ArrayList<>();

        theList.add(new Person(1, "geeta", "geeta@gmail.com", 21, "777777"));
        theList.add(new Person(2, "geeta1", "geeta@gmail.com", 22, "33332"));
        theList.add(new Person(3, "geeta2", "geeta@gmail.com", 23, "33997"));
        theList.add(new Person(4, "geeta3", "geeta@gmail.com", 24, "333000"));
        theList.add(new Person(5, "geeta4", "geeta@gmail.com", 25, "3333"));

        return theList;
    }
	
}
