package KrishnaSandeepJavaPrograms;


class LeftRotateBy1Position{
	  
	  public static void main(String[] args){
	    
	    int [] array={10,20,30,40};
	    
	    
	    int temp=array[0];
	    
	    int lastindex=array.length-1;
	    for(int i=1;i<array.length;i++){
	      
	       array[i-1]=array[i];
	       
	    }
	    array[lastindex]=temp;
	    
	   for(int i:array){
	     
	     System.out.print(i+ " ");
	   }
	   
	   
	   
	    
	  }
	  
	}