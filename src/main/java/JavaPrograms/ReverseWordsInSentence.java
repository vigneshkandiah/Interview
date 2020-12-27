package JavaPrograms;

public class ReverseWordsInSentence {
	
	public static void main(String[] args) {
		
		String sentence="I Want To Go To Canada";
		
		String reversed="";
		
		
		String[] split = sentence.split(" ");
		
		for (int i = split.length-1; i>=0 ; i--) {
			
			reversed=split[i]+" ";
			System.out.print(reversed);
			
		}
		
		
		
	}

}
