package KrishnaSandeepJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseCollection{
	   
	   public static void main(String[] args){
	     
	     Integer [] numbers={1,2,6,4,5};
	     
	     List<Integer> list = Arrays.asList(numbers);
	     
	     Collections.reverse(list);
	     
	     System.out.println(list);
	     
	   }
	   
	 }
