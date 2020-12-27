package KrishnaSandeepJavaPrograms;

class DuplicateElements1{
	  
	  public static void main(String[] args){
	    
	    int [] array={1,3,4,4,5,3};
	    boolean flag=false;
	    
	    for(int i=0;i<array.length;i++){
	      
	      for(int j=i+1;j<array.length;j++){
	        
	        if(array[i]==array[j]){
	          
	         
	          flag=true;
	          
	          System.out.println("The Duplicate Element in array is :"+array[i]);
	          
	        }
	      }
	    }
	    
	    if(flag==false){
	      
	      System.out.println("There are no Duplicate Element in the array");
	      
	    }
	    
	  }
	  
	  
	}