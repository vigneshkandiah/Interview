package JavaProgramsInterview;

import java.util.Scanner;

public class ToCheckPrimeOrNot {
	
	
	public void isPrime() {
		
		
		System.out.println("Enter the Number: ");
		
		Scanner scan = new Scanner (System.in);
		
		int givenNum = scan.nextInt();
		
		int count=0;
		
		
		if(givenNum>0) {
			
			
			for (int i = 1; i <= givenNum; i++) {
				
				if(givenNum%i==0) {
					
					count++;
					
					
					
				}
				
				
			}
			if(count==2) {
				
				System.out.println(" The Entered number "+ givenNum + " is a Prime Number");
			}else {
			
			
			System.out.println("The Enetered Number "+givenNum + " is Not Prime Number.");
		}
		
		
		
		}
		
		else {
			
			System.out.println("The Enetered Number "+givenNum + " is Not Prime Number.");
			
		}
	}
	
	public static void main(String[] args) {
		
		
		ToCheckPrimeOrNot object = new ToCheckPrimeOrNot();
		
		object.isPrime();
		
		
		
		
	}

}
