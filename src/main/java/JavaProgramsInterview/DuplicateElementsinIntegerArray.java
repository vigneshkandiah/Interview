package JavaProgramsInterview;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class DuplicateElementsinIntegerArray {
	
	public static void main(String[] args) {
		
		
		int[] arrayNum = {1,3,5,6,6,8,8,9,3};
		
		
		boolean status=false;
		
		
		for (int i = 0; i < arrayNum.length; i++) {
			
			for (int j = i+1; j < arrayNum.length; j++) {
				
				if(arrayNum[i]==arrayNum[j]) {
					
					System.out.println("The duplicate element found " +arrayNum[i]);
					
					status=true;
				}
				
			}
		}
		
		if(status==false) {
			
			System.out.println("The duplicate element Not found in the given Array");
		}
		
	}

}
