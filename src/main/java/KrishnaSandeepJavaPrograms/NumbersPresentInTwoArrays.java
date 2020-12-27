package KrishnaSandeepJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class NumbersPresentInTwoArrays{
	  
	  public static void main(String[] args){
	    
	    Integer num1[]={1,2,3};
	    Integer num2[]={2,3,4};
	    Integer num3[]={1,5,6};
	    
	    HashSet<Integer> set = new HashSet<Integer>();
	    
	    List<Integer> l1= Arrays.asList(num1);
	    List<Integer> l2= Arrays.asList(num2);
	    List<Integer> l3= Arrays.asList(num3);
	    
	    set.addAll(l1);
	    set.addAll(l2);
	    set.addAll(l3);
	    
	    List<Integer> finallist= new ArrayList<Integer>();
	    
	    for(Integer number:set){
	      
	      if(l1.contains(number)&&l2.contains(number)
	      ||l2.contains(number)&&l3.contains(number)
	      ||l3.contains(number)&&l1.contains(number)){
	        
	        finallist.add(number);
	        
	        
	      }
	      
	    }
	    
	    System.out.println(finallist);
	    
	  }
	  
	  
	}  