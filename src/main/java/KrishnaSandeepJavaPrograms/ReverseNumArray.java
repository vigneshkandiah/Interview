package KrishnaSandeepJavaPrograms;

import java.util.Stack;

class ReverseNumArray{
	  
	  public static void main(String[] args){
	    
	    int[] numArray={2,3,1,4,5,6};
	    
	    reverse(numArray);
	    
	    
	  }
	  
	  
	  public static void reverse(int [] numArray){
	    
	    Stack<Integer> st= new Stack<Integer>();
	    
	    for(int i=0;i<numArray.length;i++){
	      
	      
	        
	        st.push(numArray[i]);
	     
	    }
	    
	   for(int i=0;i<numArray.length;i++){
	      
	      
	        
	      System.out.println(st.pop()) ;
	     
	    }   
	        
	  
	}
	   
	} 
	    