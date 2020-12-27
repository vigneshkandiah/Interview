package JavaProgramsInterview;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordInString {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter The String :");
		
		Scanner scan = new Scanner(System.in);
		
		String givenString = scan.nextLine();
		
		//Method1
	
//		char[] charArray = givenString.toCharArray();
//		
//		int count=1;
//		for (int i = 0; i < charArray.length-1; i++) {
//			
//			if(charArray[i]==' '&& charArray[i+1]!= ' ') {
//				
//				count++;
//				
//				
//			}
//			
//		}
//		
//		System.out.println(count);
		
		
		int count=1;
		for (int i = 0; i < givenString.length()-1; i++) {
			
			if(givenString.charAt(i)==' '&&givenString.charAt(i+1)!=' ') {
				
				count++;
			}
			
			
			
		}
		
		System.out.println("The Number of words in the Given String is : "+ count);
		
		
	
	
	

}

}