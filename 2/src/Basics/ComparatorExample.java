package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ComparatorExample {

	public static void main(String args[]) throws InterruptedException {

		List<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("Goms", 31));
		dogList.add(new Dog("Krish", 33));

		Collections.sort(dogList);
		System.out.println(dogList);

		List<Goms> gomsList = new ArrayList<>();
		gomsList.add(new Goms("Goms", 31));
		gomsList.add(new Goms("Goms2", 30));

		Comparator comp = new Comparator() {

			@Override
			public int compare(Object arg0, Object arg1) {
				Goms goms1 = (Goms) arg0;
				Goms goms2 = (Goms) arg1;
				if (goms1.age > goms2.age)
					return 1;
				else
					return -1;
			}

		};
		
		//gomsList.sort(comp);
		//Collections.sort(gomsList, comp);
		
		Collections.sort(gomsList, (a,b) -> a.age - b.age);
		//System.out.println(gomsList);
		Iterator<Goms> it = gomsList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
		BlockingQueue<String> queue = new LinkedBlockingDeque<>();
		queue.offer("Goms");
		queue.offer("Krish");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.take());
		}
		
	}

}

class Dog implements Comparable<Dog> {
	String name;
	int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Dog arg0) {

		if (this.age < arg0.age)
			return 1;
		else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}

class Goms {
	String name;
	int age;

	public Goms(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Goms [name=" + name + "]";
	}
	
	
}
