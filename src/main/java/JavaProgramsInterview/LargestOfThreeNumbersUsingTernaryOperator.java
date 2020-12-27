package JavaProgramsInterview;

import java.util.Scanner;

public class LargestOfThreeNumbersUsingTernaryOperator {
	
	
	public void largestThreeNumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First Number :");
		int num1=scan.nextInt();
		System.out.println("Enter the First Number :");
		int num2 = scan.nextInt();
		System.out.println("Enter the First Number :");
	
		int num3 = scan.nextInt();
		
		
		
		int largest=num1> num2 ?num1:num2;
		
		largest=num3>largest?num3:largest;
		
		System.out.println(largest);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		LargestOfThreeNumbersUsingTernaryOperator ob1= new LargestOfThreeNumbersUsingTernaryOperator();
		ob1.largestThreeNumber();
		
	}

}
