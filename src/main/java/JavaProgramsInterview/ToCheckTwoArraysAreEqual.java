package JavaProgramsInterview;

import java.util.Arrays;

public class ToCheckTwoArraysAreEqual {
	
	
	public static void main(String[] args) {
		
		int [] array1= {1,3,4,8};
		
		int [] array2= {1,2,3,4,5};
		boolean status=true;
		if(array1.length==array2.length) {
			
		for (int i = 0; i < array1.length; i++) {
			
			if(array1[i]!=array2[i]) {
				
				status=false;
			}
		}
			
		
		
		}else {
			System.out.println("Array1 and Array2 are not equal");
		}
		
		if (status==true) {
			
			System.out.println("The Array 1 and array 2 are equal");
			
		}else {
			System.out.println("Array1 and Array2 are not equal");
			
		}
		
//		boolean equals = Arrays.equals(array1, array2);
//		
//		System.out.println(equals);
	}

}
