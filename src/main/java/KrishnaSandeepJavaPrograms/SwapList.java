package KrishnaSandeepJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SwapList{
	   
	   public static void main(String[] args){
	     
	     Integer [] numbers={1,2,3,4,5};
	     
	     List<Integer> list = Arrays.asList(numbers);
	     
	     Collections.swap(list,1,0);
	     
	     System.out.println(list);
	     
	     
	     
	   }
	   
	 }
