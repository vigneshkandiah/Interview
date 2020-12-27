package JavaProgramsInterview;

import java.util.Scanner;

public class CountTheNumberofDigits {
	
	public void countOfNumber() {
		
		System.out.println("Enter the Number to give its count: ");
		
		Scanner scan = new Scanner(System.in);
		
		int givenNumber=scan.nextInt();
		
	
		
		
		int count=0;
		while(givenNumber!=0) {
			
			givenNumber=givenNumber/10;
			
			count++;
			
		}
		
		
		System.out.println(count);
		
		
		
	}
	
public static void main(String[] args) {
	
	CountTheNumberofDigits obj= new CountTheNumberofDigits();
	
	obj.countOfNumber();
}
}
