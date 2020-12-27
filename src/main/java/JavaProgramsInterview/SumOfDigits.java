package JavaProgramsInterview;

import java.util.Scanner;

public class SumOfDigits {
	
	
	public void givenNumber() {
		
		System.out.println("Enter the Given Number:");
		
		Scanner scan = new Scanner(System.in);
		
		int givenNumber = scan.nextInt();
		
		int sum=0;
		int newNumber=0;
		while(givenNumber!=0) {
		
		
		newNumber=(givenNumber%10);
		
		sum+=newNumber;
		
		
		givenNumber= givenNumber/10;
		
		
			
		}
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		SumOfDigits obj= new SumOfDigits();
		obj.givenNumber();
		
	}

}
