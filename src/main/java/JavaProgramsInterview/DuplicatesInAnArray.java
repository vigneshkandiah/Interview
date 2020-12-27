package JavaProgramsInterview;

public class DuplicatesInAnArray {
	
	
	public static void main(String[] args) {
		
		String [] languages= {"java","python","groovy","java","ruby"};
		boolean status=false;
		for (int i = 0; i < languages.length; i++) {
			
			for (int j = i+1; j < languages.length; j++) {
				
				if(languages[i]==(languages[j])) {
					
					System.out.println("Found duplicate element "+ languages[i]);
					status=true;
					
				}
				
			}
			
			
			
		}
		if(status==false) {
			
			System.out.println("No duplicate elementfound in the Given Array");
			
		}
	}
	
	
	

}
