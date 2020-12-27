package KrishnaSandeepJavaPrograms;

class SquareSortedPosNegArray{
	  
	  public static void main(String[] args){
	    
	    int array []={-6,-1,2,3,6,7};
	    
	    int [] squaredArray = squareSortedArray(array);
	    
	   for(int i=0;i<squaredArray.length;i++){
	     
	     System.out.println(squaredArray[i]);
	   }
	    
	  }
	  
	  
	  public static int[] squareSortedArray(int[] array){
		  int [] squaredArray = new int[array.length];
	    int start=0;
	    
	    int end=array.length-1;
	    
	    int squareIndex=array.length-1;
	    
	    
	    while(start<=end){
	    	
	    	
	      
	      if(array[start]*array[start]>array[end]*array[end]){
	        
	        squaredArray[squareIndex--]=array[start]*array[start];
	        
	        start++;
	        
	      }else{
	        squaredArray[squareIndex--]=array[end]*array[end];
	        end--;
	        
	      }
	      
	    }
		return squaredArray;
	    
	   
	    
	  }
	  
	}
