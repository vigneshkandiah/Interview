package JavaPrograms;

public class ReverseTheWordsInString {
	
	//  I/P: I Love India
	
	//  O/P: India Love I
	
	public static void main(String[] args) {
		
		String given = "I Love India";
		
		
		String reversed="";
		
		String[] temp = given.split(" ");
		
		System.out.println(temp.length);
		
		for (int i = temp.length-1; i >=0 ; i--) {
			
			reversed =temp[i]+" ";
			
			System.out.print(reversed);
			
		}
		
		
		
	}
	

}
