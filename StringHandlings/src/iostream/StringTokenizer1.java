package iostream;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String s = "You,are,creater,of,your,destiny";
		StringTokenizer st = new StringTokenizer(s,",", true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
