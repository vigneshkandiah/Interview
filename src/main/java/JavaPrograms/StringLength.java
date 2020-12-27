package JavaPrograms;

import java.util.Scanner;

public class StringLength {
	
	
	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner scan = new Scanner(System.in);
		String string = scan.next();
		
		
		
		
		char[] charArray = string.toCharArray();
		
		
		int length=0;
		for (int i = 0; i < charArray.length; i++) {
			
			length++;
			
		}
		
		System.out.println("The Length of the Given String is :"+length);
		
		
	}

}
