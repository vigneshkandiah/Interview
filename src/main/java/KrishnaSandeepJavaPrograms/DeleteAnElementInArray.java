package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class DeleteAnElementInArray{
	   
	   public static void main(String[] args){
	     
	     int [] originalArray={1,3,4,5,6};
	     
	     //int index=2;
	     
	     int key=1;
	     int key2=3;
	     
	     int [] newArray= new int[originalArray.length-2];
	     
	     
	     for(int i=0,k=0;i<originalArray.length;i++){
	       
	       if(originalArray[i]==key){
	         
	         continue;
	       }else if (originalArray[i]==key2){
	         
	         continue;
	         
	       }
	       
	       newArray[k++]=originalArray[i];
	       
	     }
	     
	    System.out.println(Arrays.toString(newArray)); 
	     
	   }
	   
	   
	 }
