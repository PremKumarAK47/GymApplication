# GymApplication
## The class has the following parameters
class Person {
			person_id
			name 
			email 
			age
			mobile
}

class Gym {
			gym_id
			gym_name 
			monthly_fee
}
## This is a Gym Application Which Have Following Properties..
**class PersonService{**

**private Map theMap<Person, Gym>;** // inject 3 entries with valid details 

**private List<Person> theList;** // inject List of 5 Person object

**private String appName;**  // inject the AppName from the properties file **[ you can define app name as per your convenience. For Example AppName = “GymApplication” ]**

**//Hint: Make use of @Bean annotation to inject theMap and theList;** 

**public void printMap(){**

//print all the person's and their gym details from the Map

**}**

**public void printList(){**

//sort the List of Person according to the increasing order of the age 

//print all the sorted Person Details

**}**

**public void printAppName(){**

//print the injected appName

**}**

## Tech Stack I have used
### Java and Build Tool maven And Spring Framework
