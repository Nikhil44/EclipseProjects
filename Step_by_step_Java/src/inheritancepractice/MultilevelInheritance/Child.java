package inheritancepractice.MultilevelInheritance;

public class Child extends Parent {
	
	
	
	Child(){
		System.out.println("Child Object: "+this);
	}
	void f1() {
		System.out.println("Inside f1 method of child class");
	}
	
	  public static void display() {
		  System.out.println("Display Method from child class");
	  }
	  
	  public static void main(String[] args) {
		Parent child= new Child();
		child.display();
		
		child.f1();
	}
}
