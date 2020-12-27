package JavaPrograms;

import java.util.Scanner;

public class FloydTrianglePractise {
	public static void main(String[] args) {
		int row,column=0;
		System.out.println("Enter the Number of Lines:");
		
		Scanner scan = new Scanner(System.in);
		
		int numOfLines = scan.nextInt();
		
		for (row = 0; row <numOfLines ; row++) {
			
			for (column = 0; column <=row; column++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
	}

}
