package JavaPrograms;

public class NumericValueFromStringAndAdd {
	
	public static void main(String[] args) {
		
		String givenString="I Love 5 Countries and 60 hotels and 7 People";
		
		
//		
//		int total=0;
//		
//		
//		int length = givenString.length();
//		
//		
//		for (int i = 0; i < length; i++) {
//			
//			char character = givenString.charAt(i);
//			
//			if(Character.isDigit(character)) {
//				
//				
//				
//				total=total+Character.getNumericValue(character);
//			}
//			
//		}
//		
//		System.out.println(total);
		
		
		givenString =givenString.replaceAll("[A-Za-z \t]", "");
		
		char[] charArray = givenString.toCharArray();
		
		int total=0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			
			
			total=total+Character.getNumericValue(charArray[i]);
			
		}
		
		
		System.out.println(total);
		
		
		
		
		
	}

}
