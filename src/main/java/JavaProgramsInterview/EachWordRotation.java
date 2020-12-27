package JavaProgramsInterview;

public class EachWordRotation {


	public static void main(String[] args) {


		String originalString ="WELCOME TO JAVA";

		
		System.out.println("String Before rotation :" + originalString);

		String reversedstring="";
		String[] words = originalString.split("\\s");
		
		for (String eachword : words) {

			String reversedword="";
			for (int i = eachword.length()-1; i >=0; i--) {

				

				reversedword=reversedword+eachword.charAt(i);

			}
			
			reversedstring=reversedstring+reversedword+" ";
		}
			
		System.out.println(reversedstring);	
	}
}
	
	
	
	


