package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person arg0) {
		
		return Integer.compare(this.age, arg0.age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public static void main(String args[]) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Kumar", 30));
		personList.add(new Person("Goms", 31));
		
		Collections.sort(personList);
		
		System.out.println(personList);
	}
}


