package JavaPrograms;

import java.util.Scanner;

public class FloydTriangle {


	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Lines: ");

		int numOflines = scanner.nextInt();
		
		int row,column=0;
		
		for (row = 0; row < numOflines; row++) {
			
			
			
			for (column = 0; column<=row; column++) {
				
				
				System.out.print("* ");
				
			}
			System.out.println();
		}








	}

}
