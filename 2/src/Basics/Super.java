package Basics;

public class Super {

	public static void main(String args[]) {
		Child obj = new Child(30);
		obj.display();
	}

}

class Parent {
	int x = 10;

	public Parent(int x) {
		this.x = x;
	}

	public void display() {
		
		System.out.println("Parent " + x);
		
	}
	
}

class Child extends Parent {
	int x = 20;

	public Child(int x) {
		super(x);
	}
	
	public void display() {
		super.display();
		System.out.println(x);
	}

}