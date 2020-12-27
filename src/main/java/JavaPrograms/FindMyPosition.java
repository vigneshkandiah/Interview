package JavaPrograms;

import java.util.Scanner;

public class FindMyPosition {

	
	public void name() {
		
		System.out.println("Enter your Chacter: ");
		
		Scanner scan = new Scanner(System.in);
		
		char givenChar = scan.next().charAt(0);
		
		
		givenChar = Character.toUpperCase(givenChar);
		
		int aciiValue= (int)givenChar;
		
		System.out.println(aciiValue);
		
		int position =aciiValue-64;
		
		System.out.println(position);
		
		
		
		
		
		
	}
	
	
	public void main() {
		
		char text='a';
		
		text=Character.toLowerCase(text);
	    
	    int ASCII = (int)text;
	    
	    System.out.println(ASCII);
	    
	    
	    int position=ASCII-96;
	    
	    System.out.println(position);
	}
	
	
	public static void main(String[] args) {
		
		FindMyPosition obj = new FindMyPosition();
		obj.name();
		obj.main();
		
	}
	
}
