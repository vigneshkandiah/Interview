package JavaProgramsInterview;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	
	
	public void largestThreeNumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First Number :");
		int num1=scan.nextInt();
		System.out.println("Enter the First Number :");
		int num2 = scan.nextInt();
		System.out.println("Enter the First Number :");
	
		int num3 = scan.nextInt();
		
		
		
		if(num1 > num2 ) {
			
			System.out.println("The Number "+ num1 +" is greater");
			
			
		}else if(num1<num3){
			
			System.out.println("The Number "+ num3 +" is greater");
			
			
		}else{
			
			System.out.println("The Number "+ num2 +" is greater");
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LargestOfThreeNumbers ob1= new LargestOfThreeNumbers();
		ob1.largestThreeNumber();
		
	}

}
