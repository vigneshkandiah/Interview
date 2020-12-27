package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		
		//There is no String Reverse method in String Class
		
        //1. Using StringBuffer
		StringBuffer name = new StringBuffer("Vignesh");

		StringBuffer reverse = name.reverse();

		System.out.println(reverse);

		//2. Using StringBuilder
		StringBuilder name1 = new StringBuilder("Vignesh");

		StringBuilder reverse2 = name1.reverse();
		System.out.println(reverse2);
		
		//3. Using for loop in toCharArray
		
		
//		String  name3="Vignesh";
//		
//		char[] charArray = name3.toCharArray();
//		
//		for (int i = charArray.length-1; i >=0 ; i--) {
//			
//			System.out.print(charArray[i]);
//			
//		}
		
		//4.Using CharAt
		
//		String  name3="Vignesh";
//		for (int i = name3.length()-1; i >=0; i--) {
//			
//			System.out.print(name.charAt(i));
//			
//			
//			
//		}
		
		//5.Using Charcter list
		
		
		
		
		
		
		






	}

}
