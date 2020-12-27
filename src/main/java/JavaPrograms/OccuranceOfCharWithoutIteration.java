package JavaPrograms;

public class OccuranceOfCharWithoutIteration {
	
	public static void main(String[] args) {
		
		String givenString="VigneshKandiahKaniMozhi";
		
		int actual = givenString.length();
		
		char charTosearch='h';
		
		givenString= givenString.toLowerCase();
		
		
		String charToFind=Character.toString(charTosearch).toLowerCase();
		
		
		givenString=givenString.replace(charToFind, "");
		
		System.out.println(givenString);
		
		int last = givenString.length();
		
		
		int occurance=actual-last;
		
		System.out.println(occurance);
		
		
		
	}

}
