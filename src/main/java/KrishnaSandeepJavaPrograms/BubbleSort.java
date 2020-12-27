package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class BubbleSort{
	  public static void main(String[] args){
	    
	    int number[]={9,3,6,2,1,4};
	    
	    System.out.println("The Array Before Sorting :"+Arrays.toString(number));
	    int n=number.length;
	    
	    
	    int temp=0;
	    for(int i=0;i<n-1;i++){
	      
	      for(int j=0;j<n-1;j++){
	        
	        if(number[j]>number[j+1]){
	          
	          temp=number[j];
	          
	          number[j]=number[j+1];
	          
	          number[j+1]=temp;
	          
	        }
	        
	        
	      }
	    }
	    
	   System.out.println("The Array After Sorting :"+Arrays.toString(number)); 
	    
	  }
	  
	}