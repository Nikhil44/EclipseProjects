package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) {

		try {
		FileInputStream  fileinput = new FileInputStream("C:\\Users\\HP\\Desktop\\Goals after promotion1.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File cloud not be found, Please check file path");
			
		}
	}

}
