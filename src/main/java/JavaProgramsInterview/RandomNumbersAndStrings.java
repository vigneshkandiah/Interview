package JavaProgramsInterview;

import java.util.Random;

import org.apache.commons.lang3.*;

public class RandomNumbersAndStrings {
	
	public static void main(String[] args) {
		
		//Method 1:
		
//		
//		Random rand = new Random();
//		
//		int nextInt = rand.nextInt(100000);
//		
//		double nextDouble = rand.nextDouble();
//		
//		
//		System.out.println(nextInt);
//		
//		System.out.println(nextDouble);
		
		//Method 2:
		
		double random = Math.random();
		
		System.out.println(Math.floor(random));
		
		//Method3 :
		
		String randomNumeric = RandomStringUtils.randomNumeric(5);
		
		
		System.out.println(randomNumeric);
		
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(26);
		
		System.out.println(randomAlphabetic);
		
		
		
		
	
		
	}
	

}
