package encapsulation;

public class Test {

	public static void main(String[] args) {
		Patient c = new Patient();
		c.setName("Nikhil");
		c.setId(10);
		c.setSsn("12346679");
		
		System.out.println("First Name : "+c.getName());
		System.out.println("Last Name  : "+c.getId());
		System.out.println("Credt card : "+c.getSsn());
		
		}

}
