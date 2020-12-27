package JavaPrograms;

public class ToFindTheOccuranceOfCharcter {
	
	
	public static void main(String[] args) {
		
		String input = "Kanimozhivigneshkandiah";
		
		char toFind='h';
		
		
		int occurence=0;
		
		input=input.toLowerCase();
		
		for(int i=0; i<=input.length()-1;i++) {
			
			if(input.charAt(i)==toFind) {
				
				occurence=occurence+1;
			}
			
			
		}
		
		System.out.println(occurence);
	}

}
