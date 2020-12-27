package JavaPrograms;

import java.util.Scanner;

public class FloydNumberTrianglePractise {
	
	public static void main(String[] args) {
		
		int row,col=0;
		
		System.out.println("Enter the Limit: ");
		
		Scanner scan = new Scanner(System.in);
		
		int startNum=1;
		
		int limit = scan.nextInt();
		
		
		for (row= 0; row < limit; row++) {
			
			
			for (col = 0; col <=row; col++) {
				
				System.out.print(startNum);
				
				startNum=startNum+1;
				
			}
			
			System.out.println();
		}
		
	}

}
