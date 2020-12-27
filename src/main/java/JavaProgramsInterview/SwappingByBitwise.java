package JavaProgramsInterview;

public class SwappingByBitwise {
	
	
	public static void main(String[] args) {
		
		//Using XOR operator
		int a=10;
		
		int b=20;
		
		a=a^b;
		
		System.out.println(a);
		b=a^b;
		
		System.out.println(b);
		
		a=a^b;
		
		System.out.println(a);
		
		
		System.out.println(a);
		
		System.out.println(b);
		
	}

}
