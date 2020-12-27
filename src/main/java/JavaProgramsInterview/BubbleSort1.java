package JavaProgramsInterview;

import java.util.Arrays;

public class BubbleSort1 {
	
	
	public static void main(String[] args) {
		
		int[] array= {3,6,1,2,8,9,5};
		
		
		System.out.println("The Arrays Before Sorting :"+ Arrays.toString(array));
		int n= array.length;
		
		for (int i = 0; i < n-1; i++) {
			
			for (int j = 0; j < n-1; j++) {
				
				if(array[j]>array[j+1]) {
					
					int temp=array[j];
					
					array[j]=array[j+1];
					
					array[j+1]=temp;
					
					
				}
				
				
			}
			
		}
		
		System.out.println("The Arrays After Sorting :"+ Arrays.toString(array));
		
	}

}
