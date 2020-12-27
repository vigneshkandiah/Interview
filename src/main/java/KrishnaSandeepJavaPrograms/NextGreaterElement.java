package KrishnaSandeepJavaPrograms;

class NextGreaterElement{
	  
	  public static void nextgrt(int [] numArray){
	    
	    
	    int next=0;;
	    
	    for(int i=0;i<numArray.length;i++){
	    	next=-1;
	      for(int j=i+1;j<numArray.length;j++){
	        
	        if(numArray[i]<numArray[j]){
	          
	          next=numArray[j];
	          
	          break;
	          
	        }
	        
	      }
	      
	      System.out.println("The Next greatest number to :"+numArray[i]+ " is " +next);
	      
	    }
	    
	    
	  }
	  
	  
	  
	  
	  
	  public static void main(String args[]){
	    
	    int [] numArray={14,18,12,13,14};
	    
	    nextgrt(numArray);
	    
	  }
	  
	}
