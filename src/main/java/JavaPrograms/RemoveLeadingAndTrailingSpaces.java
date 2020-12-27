package JavaPrograms;




public class RemoveLeadingAndTrailingSpaces {
	
	
	public static void main(String[] args) {
		
		String text ="    I Love India  ";
		
		//1.Using Trim option
		
//		String trim = text.trim();
//		
//		
//		System.out.println(trim);
		//2.Using Strip() Function
		
		//String strip =text.strip();
		
		//String strip =text.stripLeading();
		
		//String strip =text.stripTrailing();
		
		
//		String replaceAll = text.replaceAll("^[ \t]+|[ \t]$", "");
		
//		String replaceAll = text.replaceAll("^[ \t]+|$", "");
		
		System.out.println(text.replaceAll("^[ \t]+|$",""));
		String replaceAll = text.replaceAll("[ \\t]+$", "");
		System.out.println(text.replaceAll("^[ \t]",""));
		
	
		System.out.println(replaceAll);
		
		
	}

}
