package JavaProgramsInterview;

public class SumOfIntegersInArray {
	
	public static void main(String[] args) {
		
		int[] array= {1,3,4};
		
		int sum =0;
		
//		for (int i = 0; i < array.length; i++) {
//			
//			sum=sum+array[i];
//			
//		}
		
		for (int each : array) {
			
			sum=sum+each;
			
		}
		
		
		System.out.println(sum);
		
	}

}
