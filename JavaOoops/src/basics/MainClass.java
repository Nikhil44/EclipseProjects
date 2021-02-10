package basics;

public class MainClass {
	
	MainClass(){
		System.out.println("This is default constructor of main class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person niks = new Person("Sare Jaha se Acha","Deepak",25);
		Person rahul = new Person();
		rahul.walk();
		rahul.walk(500);
		

	}

}

class Person{
	public String name ;
	public static int age ;
	
	Person(){
		this("Tere Liye", "Rahul",45);
		System.out.println("This is default constructor of Person class");
	}

	Person(String sing, String nav, int vay){
		//this();
		this.name=nav;
		this.age=vay;
		System.out.println("This is parameterized constructor of Person class: "+sing +" name is : "+nav + "age is : "+ vay);
	}
	void walk() {
		System.out.println("Nikhil Likes walking and running");
		
	}
	void eat() {
		System.out.println("Nikhil Likes eat  Chicken");
	}
	void walk(int steps) {
		System.out.println(name+ " walked :"+steps);
		
		
	}
	
	
}
