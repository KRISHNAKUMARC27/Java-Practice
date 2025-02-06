package Basics;

public class ThisExample {

	public static void main(String args[]) {
		Bird bird = new Bird();
		bird.display();
	}
}

class Ani {
	String name;

	public Ani(String name) {
		this.name = name;
	}
}

class Bird {
	String name;

	public Bird() {
		this("Crow");
	}

	public Bird(String name) {
		this.name = name;
	}

	public void display() {

		System.out.println(name);

	}

	public static void dis() {
		System.out.println("Hello");
	}

}

class A {
	B b;

	public A(B b) {
		this.b = b;
	}
}

class B {
	A a;

	B() {
		this.a = new A(this);
	}
}
