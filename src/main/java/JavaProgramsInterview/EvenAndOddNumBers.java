package JavaProgramsInterview;

import java.util.Scanner;

public class EvenAndOddNumBers {
	
	
public void countOfNumber() {
		
		System.out.println("Enter the Number to give its count: ");
		
		Scanner scan = new Scanner(System.in);
		
		int givenNumber=scan.nextInt();
		
	
		
		
		int oddCount=0;
		
		int evenCount=0;
		
		int newnumber=0;
		
		while(givenNumber!=0) {
			
			newnumber=givenNumber%10;
			
			if(newnumber%2==0) {
				
				evenCount++;
				
				
			}else {
				oddCount++;
				
			}
			
			givenNumber= givenNumber/10;
			
		}
		
		System.out.println("The count of Odd Number is :"+ oddCount);
		
		System.out.println("The count of Even Number is :"+evenCount );
		
		
		
	}
	
public static void main(String[] args) {
	
	EvenAndOddNumBers obj= new EvenAndOddNumBers();
	
	obj.countOfNumber();
}

}
