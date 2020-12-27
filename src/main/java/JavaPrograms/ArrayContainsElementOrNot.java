package JavaPrograms;

import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {
	
	
	public void method1() {
		
		int[] array = {4,5,3,7,2,8};
		int numtoFind=4;
		boolean found=false;
		
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]==numtoFind) {
				
				found=true;
				
				break;
			}
			
			
				
			}
		
		if(found) {
			System.out.println("The Element Is Prsent in The Given Array");
		}else {
			System.out.println("The Element Is Not Prsent in The Given Array");
		}
		
		
	}
	
	
public void method2() {
	int[] array1 = {4,5,3,7,2,8};
	int numtoFind1=4;
	IntStream.of(array1).anyMatch(element->element==numtoFind1);
		boolean found1=false;
//		int[] array = {4,5,3,7,2,8};
//		int numtoFind=9;
//		boolean found=false;
//		
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			if(array[i]==numtoFind) {
//				
//				found=true;
//				
//				break;
//			}
//			
//			
//				
//			}
//		
		if(found1=true) {
			System.out.println("The Element Is Prsent in The Given Array");
		}else {
			System.out.println("The Element Is Not Prsent in The Given Array");
		}
		
		
	}
	public static void main(String[] args) {
		
		
		ArrayContainsElementOrNot obj = new ArrayContainsElementOrNot();
		
		obj.method1();
		obj.method2();
			
		}
		
		
		
		
		
	}


