package JavaPrograms;

import java.util.stream.IntStream;


public class FindNumberGivenInTheArray {
	public int [] array = {5,6,7,9,3};
	
	public int numToFind=10;
	
	boolean found=false;
	
	
	
	public void method1() {
		
		for (int eachNum : array) {
			
			if(eachNum==numToFind) {
				
				found=true;
				break;
			}
			
		}
		
		if(found==true) {
			System.out.println("The Number is found in the given array");
		}else {
			
			System.out.println("The Number is not found in the given array");
		}
		
	}
	
	
	public void method2() {
		
		if(IntStream.of(array).anyMatch(element->element==numToFind)) {
		
		found=true;
		System.out.println("The Number is found in the given array");
		}else {
			
			System.out.println("The Number is not found in the given array");
		}
		
	}
	
	
	public static void main(String[] args) {
		FindNumberGivenInTheArray obj= new FindNumberGivenInTheArray();
		
		obj.method1();
		obj.method2();
	}

}
