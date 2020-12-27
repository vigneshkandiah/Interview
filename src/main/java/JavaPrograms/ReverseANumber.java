package JavaPrograms;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		int givenNumber=76589;
		
		int reversedNumber=0;
		
		while(givenNumber!=0) {
		reversedNumber=reversedNumber*10;
		reversedNumber=reversedNumber+givenNumber%10;
		
		givenNumber=givenNumber/10;
		
		
		
		}
		
		System.out.println(reversedNumber);
		
		
		
		
		
	}

}
