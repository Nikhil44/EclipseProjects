package iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream inputstream = new FileInputStream("C:\\Users\\HP\\Desktop\\FileInputStream.txt");
		File  file = new File("C:\\Users\\HP\\Desktop\\FileInputStream.txt");
		FileInputStream inputstream1 = new FileInputStream(file);
		//System.out.println(inputstream1.read());
		try {
		int i;
		while((i=inputstream1.read())!=-1) {
			System.out.print((char)i);
			i++;
		}}
		catch(IOException e) {
			System.out.println("Please check file");
		}
		finally {
		
		inputstream1.close();
		System.out.println("\nFile is closed");

		}
	
		
		}

}
