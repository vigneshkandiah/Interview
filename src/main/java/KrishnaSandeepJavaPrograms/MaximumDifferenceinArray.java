package KrishnaSandeepJavaPrograms;


class MaximumDifferenceinArray{
	  
	  public static void main(String[] args){
	    
	    int num [] = {10,70,60,40,90};
	    
	    int maximum=num[0];
	    int minimum=num[0];
	    
	    for(int i=0 ; i<num.length;i++){
	      
	      
	      
	      if(num[i]>maximum){
	        
	        maximum=num[i];
	        
	      }
	      
	     
	      
	    }
	     
	    
	    for(int i=0 ; i<num.length;i++){
	      
	      
	      
	      if(num[i]<minimum){
	        
	        minimum=num[i];
	        
	      }
	      
	     
	      
	    } 
	    System.out.println("The Maximum diff is :"+(maximum-minimum)); 
	    
	  }
	  
	  
	}