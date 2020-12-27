package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class InsertAnElementinArrayatIndex{
	   
	   public static void main(String[]args){
	     
	     int [] array=new int [6];
	     
	     array[0]=10;
	     array[1]=20;
	     array[2]=40;
	     array[3]=50;
	     array[4]=60;
	     
	    int index=2;
	    
	    int value=30;
	    
	    for(int i=array.length-1;i>index;i--){
	      
	      array[i]=array[i-1];
	      
	      
	      
	    }
	    array[index]=value;
	     
	     
	     System.out.println(Arrays.toString(array));
	   }
	   
	 }
