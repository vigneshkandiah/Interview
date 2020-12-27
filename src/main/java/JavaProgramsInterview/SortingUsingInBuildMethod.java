package JavaProgramsInterview;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingInBuildMethod {

	public static void main(String[] args) {
		Integer array []= {3, 6, 1, 2, 8, 9, 5};

		System.out.println("Arrays Before Sorting :"+Arrays.toString(array));

		//Method 1:
		//		Arrays.parallelSort(array);
		//		
		//		System.out.println("Arrays After Sorting using Arrays.Parallel Sort :"+Arrays.toString(array));

		//Method 2:

		//		Arrays.sort(array);
		//		
		//		System.out.println("Arrays After Sorting using Arrays.Sort :"+Arrays.toString(array));

		//Method 3: Reverse Sort using Arrays.sort(array,Collections.reverseorder());

		Arrays.sort(array,Collections.reverseOrder());

		System.out.println("Arrays After Sorting using Arrays.Sort(Colections.reverseOrder) :"+Arrays.toString(array));

	}



}
