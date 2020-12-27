package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class ReverseArrayUsingTemp{
	   
	   public static void main(String[] args){
	     
	     int n [] ={20,40,10,50,60};
	     
	     int low=0;
	     
	     int high=n.length-1;
	     int temp=0;
	     while(low<high){
	       
	       temp=n[low];
	       
	       n[low]=n[high];
	       
	       n[high]=temp;
	       
	       low++;
	       high--;
	       
	       
	     }
	     
	     System.out.println(Arrays.toString(n));
	     
	   }
	   
	 }
