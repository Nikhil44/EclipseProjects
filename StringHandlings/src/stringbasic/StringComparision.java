package stringbasic;

public class StringComparision {

	public static void main(String[] args) {
String s1="Niks";
String s2= "Niks";
String s3= "Tanu";
String s4= new String("Niks");

System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));


//S1==S4 is false because == operator compare memory location of reference variable and not actual characters
System.out.println(s1==s4);

//S1.equals(S4) is true because .equals method compare actual characters
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s3));


	}

}
