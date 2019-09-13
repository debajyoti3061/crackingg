package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnitExerciseJava8 {

	public static void main(String args[]) {
		List<Person> people = Arrays.asList(
				new Person("Chad", "Chor", 20),
				new Person("Abis", "Mathew", 24),
				new Person("Chabi", "Boss",	45),
				new Person("Moti", "Chaurasia", 35),
				new Person("Patla", "Agume", 35));
		//1.Sort list by last name
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
			
		
		//2. Create method to print all names of list
		printallNames(people);
		
		//3.Create method to print names starting with last name C
		printnameswithC(people, p->p.getLastName().startsWith("A"));
		
		
	}

	private static void printallNames(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}
	private static void printnameswithC(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}

	}

}
