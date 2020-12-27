package JavaPrograms;

import java.util.Scanner;

public class OccuranceOfTheCharcterInString {
	
	public static void main(String[] args) {
		
		
		String givenString="VigneshKandiahKanimozhi";
		
		 char charToSearch='h';
		
		char[] charArray = givenString.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) {
			
			if(charToSearch==charArray[i]) {
				
				count++;
			}
			
		}
		
		System.out.println("The Number of Occurence of the givan Character in the given String is :" + count);
		
	}

}
