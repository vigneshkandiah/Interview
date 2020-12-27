package KrishnaSandeepJavaPrograms;

class DuplicateElements{
	  
	  public static void main(String[] args){
	    
	    int [] array={1,3,4,4,5,3};
	    
	    int [] temp = new int[array.length];
	    
	    
	    for(int i=0;i<temp.length;i++){
	      
	      if(temp[array[i]]==1){
	        
	        System.out.println(array[i]);
	        
	      }else{
	        
	        temp[array[i]]++;
	        
	      }
	    }
	    
	    
	  }
	  
	  
	}