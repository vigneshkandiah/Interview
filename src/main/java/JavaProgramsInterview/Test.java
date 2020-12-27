package JavaProgramsInterview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
class Test{
	  
	  public static void main(String[] args){
	    
	    String text="I Love ChargeBee for 1 company 7 products 4 founders";
	    int sum=0;
	    
	    char [] array =text.toCharArray();
	    
	    for(char each:array){
	      
	      if(Character.isDigit(each)){
	        
	        sum=sum+Character.getNumericValue(each);
	        
	      }
	      
	    }
	    
	    System.out.println(sum);
	  }
	  
	}