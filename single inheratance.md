package superclass;

class Animals {
	String name;
	Animals (String name) {
		this.name= name;
	}
	public void eat() { 
	System.out.println(name + " is eating.");
	}
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
}


class Dog extends Animals {
	Dog(String name){
		super(name);
	}
	public void bark() {
		System.out.println(name + "is barking.");	
	}
	public void show_actions() {
		eat();
		sleep();
		bark();
	}
}

public class Animal { 
	public static void main(String []args) {
	
		Dog Dog = new Dog("John");
		Dog.show_actions();
	}
}

	
package superclass;

class Animals {
	String name;
	Animals (String name) {
		this.name= name;
	}
	public void eat() { 
	System.out.println(name + " is eating.");
	}
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
}


class Dog extends Animals {
	Dog(String name){
		super(name);
	}
	public void bark() {
		System.out.println(name + "is barking.");	
	}
	public void show_actions() {
		eat();
		sleep();
		bark();
	}
}

public class Animal { 
	public static void main(String []args) {
	
		Dog Dog = new Dog("John");
		Dog.show_actions();
	}
}

	
