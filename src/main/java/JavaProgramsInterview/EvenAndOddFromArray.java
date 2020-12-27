package JavaProgramsInterview;


import java.util.ArrayList;
import java.util.List;

public class EvenAndOddFromArray {
	
	public static void main(String[] args) {
		
		int[] array= {1,4,5,6,8,9};
		List<Integer> evenlist = new ArrayList<Integer>();
		List<Integer> oddlist = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			
			int[] even = {};
			
			
			if(array[i]%2==0) {
				
				evenlist.add(array[i]);
			}else {
				oddlist.add(array[i]);
				
			}
			
			
		}
		
		for (Integer each : evenlist) {
			
			System.out.println("The Even Numbers in the given are :"+each.intValue());
			
		}
		
		for (Integer each1 : oddlist) {
			
			System.out.println("The Odd Numbers in the given are :"+each1.intValue());
			
		}
		
	}

}
