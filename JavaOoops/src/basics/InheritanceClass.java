package basics;

public class InheritanceClass {

	public static void main(String[] args) {
		Humans hum = new Humans("Manimawo", "Whilte", 1);
		hum.sound();
		hum.run();
		

	}
	
	

}

class Animal{
	String name;
	String color;
    int age;
    Animal(String name, String color,int age){
    	this.name=name;
    	this.color = color;
    	this.age=age;
    	System.out.println("This os parameeterized Constructor of Animal ");
    }
    
    public void sound() {
    	System.out.println("Animals create Sounds");
    }
    public void run() {
    	System.out.println("Animals runs");
    }
    
    
	
}

class Humans extends Animal{

	Humans(String name, String color, int age) {
		super(name, color, age);
	}
    public void sound() {
    	System.out.println("Humans create Sounds");
    }
	
}