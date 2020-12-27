package JavaProgramsInterview;

import java.util.Scanner;

public class TocheckAStringIsPalindrome {
	
	public void toCheckGivenStringIsPalindrome() {
		System.out.println("Enter the String to check is it Palidrome or not:");
		
		Scanner scan = new Scanner(System.in);
		
		String givenString=scan.nextLine();
		
		
		
		String reversedString="";
		
		for (int i = givenString.length()-1; i >=0; i--) {
			
			reversedString=reversedString+givenString.charAt(i);
			
		}
		
	




		
		
		
		if(givenString.equals(reversedString)) {
			
			System.out.println("The Given String a Palindrome");
		}else {
			
			System.out.println("The Given String not a Palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		
		TocheckAStringIsPalindrome obj = new TocheckAStringIsPalindrome();
		
		obj.toCheckGivenStringIsPalindrome();
		
	}

}
