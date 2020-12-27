package JavaProgramsInterview;

public class MinAndMaximumNumberInArray {
	
	
	public static void main(String[] args) {
		int[] arrayNum= {4,5,7,3,8,9};
		int min=arrayNum[0];
		int max=arrayNum[0];
		for (int i = 1; i < arrayNum.length; i++) {
			
			if(arrayNum[i]>max) {
				
				max=arrayNum[i];
			}
			
			
			
		}
		System.out.println("The Maximum Number in the given array is :"+ max);
		
		for (int i = 1; i < arrayNum.length; i++) {
			
			if(arrayNum[i]<min) {
				min=arrayNum[i];
				
			}
		}
		
		System.out.println("The Minimum Number in the given array is :"+ min);
	}
	
	

}
