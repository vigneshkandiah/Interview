package JavaProgramsInterview;

import java.awt.List;
import java.util.ArrayList;

public class CountOfOccuranceOfCharInString {
	
	
	public static void main(String[] args) {
		
		String text="vigneshKandiah";
		
		text=text.toLowerCase();
		//1.Method 1 using to char array
//		char[] array = text.toCharArray();
//		
//		ArrayList<Character> list = new ArrayList<Character>();
//		
//		int count=0;
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			if(array[i]=='h') {
//				
//				count++;
//				
//				
//				
//			}
//			
//		}
//		
//		System.out.println(count);
		
		
		//Method 2 using regex
		
		
		
		int lengthBefore = text.length();
		
		
		text=text.replaceAll("h", "");
		
		
		int lengthAfter = text.length();
		
		System.out.println(lengthBefore-lengthAfter);
		
	}

}
