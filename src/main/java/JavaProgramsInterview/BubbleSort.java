package JavaProgramsInterview;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array= {9,2,8,5,8,20};
		
		
		System.out.println("Array Before Sorting :"+Arrays.toString(array));
		
		int n=array.length;
		
		
		for (int i = 0; i < n-1; i++) { //number of passes
			
			
			for (int j = 0; j < n-1; j++) { //iterate the each value
				
				if(array[j]>array[j+1]) {
					
					
					int temp=array[j];
					
					array[j]=array[j+1];
					
					array[j+1]=temp;
				}
				
			}
			
		}
		
		System.out.println("Array after sorting :"+ Arrays.toString(array));
		
	}

}
