package iostream;

import java.io.*;

public class FIleOutputStream {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file = new File("C:\\Users\\HP\\Desktop\\FileInputStream.txt");
		FileInputStream input = new FileInputStream(file);
		File file2 = new File("C:\\Users\\HP\\Desktop\\Niks4444444444444.txt");
		FileOutputStream output = new FileOutputStream(file2);
		 try {
		int data;
		while((data=input.read())!=-1) {
			output.write(data);
			System.out.print((char) data);
			
		}}
		 finally {
			 input.close();
			 output.close();
		 }
		

	}

}
