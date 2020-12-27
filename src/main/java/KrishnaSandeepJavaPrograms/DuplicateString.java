package KrishnaSandeepJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DuplicateString{
	  
	  public static void main(String[] args){
	    
	    String text="I Love ChargeBee I Love ChargeBee Wil Get Through By God Grace";
	    
	    String [] words =text.split(" ");
	    
	    boolean flag=false;
	    List<String> list = Arrays.asList(words);
	    
	    Set<String> set = new HashSet<String>();
	    List<String> finalList= new ArrayList<String>();
	    for(String each:list){
	      
	      if(set.add(each)==true){
	        flag=true;
	        
	      }else{
	        
	        finalList.add(each);
	      }
	      
	    }
	    
	   for(String each1:finalList){
	     
	     System.out.println(each1);
	   }
	   
	   System.out.println("The Unique Words are :");
	   for(String each2:set){
	     
	     System.out.println(each2);
	   }
	    
	  }
	  
	}
