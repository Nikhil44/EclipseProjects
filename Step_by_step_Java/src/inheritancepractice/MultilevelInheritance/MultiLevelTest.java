package inheritancepractice.MultilevelInheritance;

public class MultiLevelTest extends Child {

	
	/*
	 * public static void display() {
	 * System.out.println("Display Method from MultiLevelTest class"); }
	 */

	void f1() {
		System.out.println("Inside f1 method of MultiLevelTest class");
	}

	
	public static void main(String[] args) {
		MultiLevelTest mul = new MultiLevelTest();
		mul.f1();
		mul.f1();
		mul.display();
		
		Child ch = new MultiLevelTest();
		ch.f1();
		ch.f1();
		ch.display();
		
		Parent p = new MultiLevelTest();
		p.f1();
		((Child) p).f1();
		p.display();
		

	}

}
