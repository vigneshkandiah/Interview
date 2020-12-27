package JavaProgramsInterview;

public class Fibinoacciseries {
	
	
	public static void main(String[] args) {
		
		int n1=0,n2=1,sum=0;
		
		System.out.print(n1+" "+n2);
		
		for (int i = 0; i < 30; i++) {
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print(" "+sum);
			
		}
	}

}
