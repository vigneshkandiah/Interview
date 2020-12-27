package JavaProgramsInterview;

public class SearchingAndElementInAnArray {
	
	
	public static void main(String[] args) {
		int[] givenNumArray= {1,4,5,6,7,9,11,12};
		
		int numToSerach=3;
		boolean status=false;
		
		for (int i = 0; i < givenNumArray.length; i++) {
			
			
			if(givenNumArray[i]==numToSerach) {
				
				System.out.println("The Number "+ numToSerach +" is present in the given array");
				
				status=true;
			}
		}
		
		if(status==false) {
			
			System.out.println("The Number is not present in the given array");
		}
	}
	
	

	
	

}
