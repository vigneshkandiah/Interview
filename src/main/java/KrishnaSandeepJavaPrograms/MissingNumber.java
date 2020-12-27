package KrishnaSandeepJavaPrograms;

import java.util.Arrays;
import java.util.List;

class MissingNumber{
	  
	  
	  public static void main(String[] args){
	    
	    Integer num[]={1,2,4,5};
	    
	    
	    int lastidex =num.length-1;
	    
	    List<Integer> list= Arrays.asList(num);
	    
	    boolean flag=true;
	    
	    
	    for(Integer i=0;i<lastidex;i++){
	      
	      int number= num[lastidex]-num[i];
	      if(list.contains(number)){
	        
	        flag=true;
	        
	      }else{
	        
	        System.out.println("The Number "+number+" Is Not Present");
	        
	      }
	      
	      
	    }
	    
	    
	  }
	  
	}
