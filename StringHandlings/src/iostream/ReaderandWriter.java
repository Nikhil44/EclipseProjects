package iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderandWriter {

	public static void main(String[] args) throws Exception {
FileReader fr;
FileWriter fw;

fr = new FileReader("C:\\Users\\HP\\Desktop\\FileReader.txt.txt");
fw = new FileWriter("C:\\Users\\HP\\Desktop\\FileReader111111111111111.txt");
int ch;
while((ch=fr.read())!= -1) {
	fw.write(ch);
	
	
	
}
fr.close();
fw.close();

	}

}
