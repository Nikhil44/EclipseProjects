package stringbasic;

public class StringBasics {

	public static void main(String[] args) {

		String str = "Nikhil";
		String s1 = new String("Hello This is String");

		System.out.println(s1.indexOf("T"));
		System.out.println(s1.indexOf("tring"));
		System.out.println(s1.charAt(10));
		System.out.println(s1.substring(11));
		System.out.println(s1.substring(0,7));
		System.out.println(str.concat(s1));
		System.out.println("rtyyyyyyyyyyyyyyyyyyyyyyyyyy"+str.replace("l", "g"));

		
		String[] s4= s1.split(" ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);
			
		}


		

		char[] a = { 'a', 'e', 'i', 'o', 'u' };
		String s2 = new String(a);

		byte[] b = { 65, 66, 67 };
		String s3 = new String();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));

		}
		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));

		}
		System.out.println();
		System.out.println("chars on string" + str.chars());

		System.out.println("Code point index : " + str.codePointAt(1));

	}

}
