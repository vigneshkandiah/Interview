package JavaPrograms;

public class ReplaceAllVowelsWithStar {
	
	public static void main(String[] args) {
		
		
		String givenString=" I Miss India";
		
		
		char[] givenStringArray = givenString.toCharArray();
		
		
		
		
		for (int i = 0; i < givenStringArray.length; i++) {
			
			if (givenString.charAt(i)=='a'||givenString.charAt(i)=='e'
					||givenString.charAt(i)=='i'
					||givenString.charAt(i)=='a'
					||givenString.charAt(i)=='u'
					||givenString.charAt(i)=='A'
					||givenString.charAt(i)=='E'
					||givenString.charAt(i)=='I'
					||givenString.charAt(i)=='O'
					||givenString.charAt(i)=='U') {
				
				givenStringArray[i]='*';
				
				
			}
			
		}
		
		System.out.println(givenStringArray);
		
	}

}
