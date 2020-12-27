package JavaProgramsInterview;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		int givenNumber=321;
		
		StringBuffer reverse = new StringBuffer(String.valueOf(givenNumber));
		
		reverse= reverse.reverse();
		
		System.out.println(reverse);
		
		int newnum=456;
		
		StringBuilder reverse1= new StringBuilder(String.valueOf(newnum));
		
		reverse1= reverse1.reverse();
		
		System.out.println(reverse1);
		
		
		
	}

}
