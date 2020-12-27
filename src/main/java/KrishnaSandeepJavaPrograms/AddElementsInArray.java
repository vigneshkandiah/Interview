package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class AddElementsInArray{
	  
	  public static void main(String[] args){
	    int n=5;
	    int sum=0;
	    int [] array= new int [n];
	    
	    for(int i=0;i<array.length;i++){
	      
	      array[i]=array[i]+i;
	      
	      sum=sum+i;
	      
	    }
	    
	    System.out.println(Arrays.toString(array));
	    
	    System.out.println(sum);
	    
	    
	  }
}
