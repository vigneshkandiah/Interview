package JavaProgramsInterview;

public class MissingNumberInTheRangeOfNumbers {
	
	
	public static void main(String[] args) {
		
		int [] array= {4,5,6,7,8,9,11};
		
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			
			
			sum=sum+array[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for (int i = 4; i <= 11; i++) {
			
			sum1=sum1+i;
			
		}
		
		System.out.println(sum1);
		
		System.out.println(sum1-sum);
	}
	
	
	
	

}
