package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderAndWordCount {

	public static void main(String[] args) {
		File inputfile = new File("C:\\Users\\HP\\Desktop\\FileReader.txt.txt");
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr= new FileReader(inputfile);
			br= new BufferedReader(fr);
			
			String line;
			int wordCount=0;
			while((line=br.readLine())!=null) {
				StringTokenizer st= new StringTokenizer(line);
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					wordCount++;
				}
			
			}
			System.out.println("The total word Count isn : "+wordCount);
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				fr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
