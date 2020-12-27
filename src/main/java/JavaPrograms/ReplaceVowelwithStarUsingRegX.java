package JavaPrograms;

public class ReplaceVowelwithStarUsingRegX {
	
	
	public static void main(String[] args) {
		
		String text="I Love Mahendra Singh Dohni";
		
		String textReplace = text.replaceAll("[AEIOUaeiou]", "\\$");
		
		System.out.println(textReplace);
		
	}

}
