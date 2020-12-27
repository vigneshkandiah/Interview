package JavaPrograms;

public class OccuranceOfVowelsInString {
	
	
	public static void main(String[] args) {
		
		
		String text="Mahendra Signh Dhoni";
		
		text=text.toLowerCase();
		
		System.out.println(text);
		
//		System.out.println(text.length());
//		
//		
//		String replaceAll = text.replaceAll("[AEIOUaeiou]", "");
//		
//		String replaceAll2 = replaceAll.replaceAll("\t", "");
//		
//		System.out.println(replaceAll2.length());
		
		
		
		
//		System.out.println(replaceAll.length());
		
		
		
        char[] charArray = text.toCharArray();
        
        
		
		int count=0;
		for (int i = 0; i < charArray.length; i++) {
			
			if(
					charArray[i]=='a'
					||charArray[i]=='e'
					||charArray[i]=='i'
					||charArray[i]=='o'
					||charArray[i]=='u') {
				
				count++;
				
				
			}
			
		}
		System.out.println("The Occurance of Vowel :"+ count);
		
	}

}
