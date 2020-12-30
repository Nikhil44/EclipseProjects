package stringbasic;

public class StringBuffer {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
		System.out.println("String buffer class");
		String s = "Hi Nikhil, How are you?";

		StringBuilder builder = new StringBuilder();
		System.out.println("The default capacity of string builder: " + builder.capacity());
		builder.append(s);
		System.out.println(builder);
		System.out.println(builder.charAt(0));
		System.out.println("Reverse String" + builder.reverse());
		String s2 = "Hello World";
		StringBuilder builder1 = new StringBuilder();

		System.out.println(builder1.append(s2));
		String s3 = builder1.toString();
		System.out.println("To check String is empty or not : " + s3.isEmpty());
		System.out.println("To check String is blank or not : " + s3.isBlank());
		System.out.println("To check last index of  : " + s3.lastIndexOf("4"));
		System.out.println("To check last index of  : " + s3.lastIndexOf("l"));
		System.out.println("To check last index of  : " + s3.indexOf("l"));
		System.out.println("Insert method in builder: "+builder1.insert(11, " How are you?"));
		//System.out.println("Insert method in builder: "+builder1.insert(0, true));
		//System.out.println("Insert method in builder: "+builder1.delete(0, 4));
		System.out.println("Insert method in builder: "+builder1.deleteCharAt(1));

		
		char a='A';
          builder1.setCharAt(1, a);
          System.out.println(builder1);
        
          





		



	}

}
