package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

public class DeleteAnEelementInIndex {
	
	
		   
		   public static void main(String[] args){
		     
		     int [] originalArray={1,3,4,5,6};
		     
		     int index=2;
		     
		     
		     
		     int [] newArray= new int[originalArray.length-1];
		     
		     
		     for(int i=0,k=0;i<originalArray.length;i++){
		       
		       if(originalArray[index]==originalArray[i]){
		         
		         continue;
		       
		       }
		       newArray[k++]=originalArray[i];
		       
		     }
		     
		    System.out.println(Arrays.toString(newArray)); 
		     
		   }
		   
		   
		   }


