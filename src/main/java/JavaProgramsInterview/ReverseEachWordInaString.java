package JavaProgramsInterview;

public class ReverseEachWordInaString {
	
	
	public static void main(String[] args) {
//		
//		String text="WELCOME TO JAVA";
//		
//		String[] words = text.split("\\s");//splitting and keep it in string array
//		
//		String reversedString=" ";
//		
//		for (String eachword : words) {
//			
//			StringBuilder builder = new StringBuilder(eachword);
//			builder.reverse();
//			
//			reversedString=reversedString+builder.toString()+" ";
//			
//			
//			
//		}
//		
//		System.out.println(reversedString);
		
		
		
		
		
		
		
		
		
		String text="I LOVE CHARGEBEE";  //original string
		
		
		
		String[] newstringArray = text.split(" ");
		
		for (String eachword : newstringArray) {
			
			String reverseword="";
			
			for (int i =eachword.length()-1; i>=0;i--) {
				
				reverseword=reverseword+eachword.charAt(i);
				
			}
			String reverseString="";
			reverseString=reverseString+reverseword+" ";
			System.out.print(reverseString);
		}
		
		
		
	}

}
