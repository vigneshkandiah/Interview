package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class SecondMaximumAndMaximum{
	  
	  public static void main (String[] args){
	    
	    int [] array={3,4,5,10,9};
	    int maximum=0;
	    int secondMaximum=0;
	    for(int i=0;i<array.length;i++){
	      
	      if(array[i]>maximum){
	        
	        maximum=array[i];
	        
	        
	        
	      }
	      
	      
	    }
	   System.out.println("The Maximum number is :"+maximum); 
	   
	   
	   Arrays.sort(array);
	   
	   int element =array.length-2;
	   
	   System.out.println("The Second Maximum number is :"+array[element]);
	   
	  }
	  
	}
