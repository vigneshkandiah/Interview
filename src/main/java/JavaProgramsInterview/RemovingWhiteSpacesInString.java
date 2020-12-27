package JavaProgramsInterview;

public class RemovingWhiteSpacesInString {
	
	public static void main(String[] args) {
		
		
		String text ="  Java     Programming     Lanuage   is very   Intresting   ";
		
//		text =text.replaceAll("[ \t]", "");
		
		text =text.replaceAll("\\s", "");
		
		
		
		System.out.println(text);
	}

}
