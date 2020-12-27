package KrishnaSandeepJavaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicatesInString{
	  
	  public static void main(String[] args){
	    
	    String test="sandeep";
	    
	    //vigneshkad
	    
	    
	    char [] array =test.toCharArray();
	    
	    Set<Character> set = new LinkedHashSet<Character>();
	    
	    for(char each:array){
	      
	      set.add(each);
	        
	        }
	      
	    for(Character each1:set)  {
	      
	      System.out.print(each1);
	      
	    }
	      
	    }
	    
	    
	    
	    
	  }
