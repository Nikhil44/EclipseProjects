package inheritancepractice.SingleInheritance;

public class SingleInheritance {
    void m1() {
    	   System.out.println("Inside m1 method");
    	
}

	public static void main(String[] args) {
		SingleInheritance sigleInstance=new SingleInheritance();
		sigleInstance.m1();
		System.out.println("get class method :"+sigleInstance.getClass());
		System.out.println("get class method :"+sigleInstance.toString());
		System.out.println("get class method :"+sigleInstance.hashCode());
		System.out.println("get class method :"+sigleInstance);
		System.out.println("get class method :"+sigleInstance.equals(sigleInstance));
		
 

	}

}
