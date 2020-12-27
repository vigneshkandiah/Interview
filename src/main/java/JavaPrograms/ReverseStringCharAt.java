package JavaPrograms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseStringCharAt {

	//Using Collection

	public void name() {
		String studentName="Ganesh";

		char[] charArray = studentName.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = charArray.length-1; i >=0; i--) {

			list.add(charArray[i]);

		}


		System.out.println(list);

	}



	public void name1() {
		String studentName1="Ganesh";

		char[] charArray1 = studentName1.toCharArray();
		
		ArrayList<Character> list1= new ArrayList<Character>();
		
		for (Character each : charArray1) {
			
			list1.add(each);
			
		}
		
		Collections.reverse(list1);
		
		ListIterator iterator = list1.listIterator();
			
			while(iterator.hasNext()) {
				
				System.out.print(iterator.next());
			}
			
			





	}
	public static void main(String[] args) {
			
			String  name3="Vignesh";
			for (int i = name3.length()-1; i >=0; i--) {
				
				System.out.print(name3.charAt(i));
				
					}

		ReverseStringCharAt obj= new ReverseStringCharAt();
		obj.name();
		obj.name1();
	}

}
