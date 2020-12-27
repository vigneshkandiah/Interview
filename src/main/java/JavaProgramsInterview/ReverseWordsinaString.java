package JavaProgramsInterview;

import java.util.Scanner;

public class ReverseWordsinaString {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String :");
		
		Scanner scan =  new Scanner(System.in);
		
		String givenString = scan.nextLine();
		
		
		String reversedString="";
		
		String reversedword="";
		
		String[] wordsArray = givenString.split(" ");
		
		for (String eachword : wordsArray) {
			
			for (int i=eachword.length()-1;i>=1;i--) {
				
				
				
				
				reversedword=reversedword+eachword.charAt(i);
				
				
				
				
			}
			
			
			
		}
		reversedString=reversedString+reversedword+" ";
		
		System.out.println(reversedString);
		
	}

}
