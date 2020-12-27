package WriteDataIntoTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("./Test.txt");
		
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("I LOVE JAVA");
		
		bw.write("I LOVE CHARGEBEE");
		
		bw.write("I LOVE PROGRAMMING");
		
		bw.close();		
	}

}
