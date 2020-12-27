package ReadingFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingaTextFile {
	
	
	
	public static void main(String[] args) throws IOException {
		//Method1
//		FileReader fr = new FileReader("./Hello.txt");
//		
//		BufferedReader br= new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine())!=null) {
//			
//			System.out.println(str);
//		}
//		br.close();
//	}
	
		//Method2 
		
		
//		File file = new File("./Hello.txt");
//		
//		Scanner scan = new Scanner(file);
//		
//		while(scan.hasNextLine()) {
//			
//			System.out.println(scan.nextLine());
//		}
		
		
      //Method3
		
		
		File file = new File("./Hello.txt");
		
		Scanner scan = new Scanner(file);
		
		scan.useDelimiter("\\z");
		
		System.out.println(scan.next());
		
		
	}

}
