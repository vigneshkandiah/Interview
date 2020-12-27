package JavaProgramsInterview;

import java.util.Scanner;

public class ReverseNumberMethod1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		
		int givenNumber = scan.nextInt();
		while(givenNumber!=0) {
		int reversed=0;
		
		reversed=reversed*10;
		reversed=reversed+givenNumber%10;
		
		givenNumber=givenNumber/10;
		System.out.print(reversed);
		
		}
		
		
		
//		while(num!=0) {
//			
//			rev=rev*10+num%10;
//			num=num/10;
//			
//			
//			
//			
//			
//		}
		
		
		
		
		
		
		
	}

}
