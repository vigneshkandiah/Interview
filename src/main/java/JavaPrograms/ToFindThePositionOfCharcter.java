package JavaPrograms;

import java.util.Scanner;

public class ToFindThePositionOfCharcter {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Charceter :");
		Scanner scan = new Scanner(System.in);
		
		
		char givenChar = scan.next().charAt(0);
		
		
		givenChar=Character.toLowerCase(givenChar);
		
		int position=(int) givenChar-96;
		
		
		System.out.println(position);
		
		
		
		
}

}
