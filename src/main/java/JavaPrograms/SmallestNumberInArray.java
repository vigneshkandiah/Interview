package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {



	Integer givenArray[]= {7,3,4,1,5,9};

	//1.using the Inetger.Maxvalue;
	public void Method1() {

		int smallest=Integer.MAX_VALUE;

		for (int i = 0; i < givenArray.length; i++) {

			if(givenArray[i]<smallest) {

				smallest=givenArray[i];

			}

		}

		System.out.println("The Smallest number in the Given Array using Integer.MaxValue :"+ smallest);

	}

	//2.Using Arrays


	public void Method2() {

		Arrays.sort(givenArray);

		System.out.println("The Smallest number in the Given Array using Arrays.sort :"+givenArray[0]);



	}

	//3.Using Collections

	public void Method3() {

		List<Integer> ls = new ArrayList<Integer>();

		for (int i = 0; i < givenArray.length; i++) {

			ls.add(givenArray[i]);


		}
		

		Collections.sort(ls);

		System.out.println("The Smallest number in the Given Array using List :"+ls.get(0));
	}

	public void Method4() {

		List<Integer> asList = Arrays.asList(givenArray);
		
		
		
		

		System.out.println("The Smallest number in the Given Array using Arrays.AsList :"+asList.get(0));
	}




	public static void main(String[] args) {
		SmallestNumberInArray obj = new SmallestNumberInArray();
		obj.Method1();
		obj.Method2();
		obj.Method3();
		obj.Method4();

	}

}