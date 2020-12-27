package JavaProgramsInterview;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringReverse {
	
	
	
	
	
	public void name() {
		
		
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		
		
		
		//Method 1
				String text="VigneshKandih";
//				
//				
//				char[] charArray = text.toCharArray();
//				
//				
				
				ArrayList<Character> list= new ArrayList<Character>();
				
				char[] charArray = text.toCharArray();
				
				
//				
//				for (int i = 0; i < charArray.length; i++) {
//					
//					list.add(charArray[i]);
//					
//				}
				
				
			StringBuffer obi = new StringBuffer();
			
			obi.append(charArray, 0, charArray.length);
			
			
			
			
			StringBuffer reverse = obi.reverse();
			
			System.out.println(reverse);
				
				
		
	}
	
	public static void main(String[] args) {
		
		StringReverse obj = new StringReverse();
		obj.name();
	}

}
