package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class AnagramUsingArraysSort{
	  
	  public static void main(String[] args){
	    
	    String text1="Java";
	    
	    String text2="aavJ";
	    
	    char [] array1 =text1.toCharArray();
	    char [] array2 =text2.toCharArray();
	    
	    Arrays.sort(array1);
	    Arrays.sort(array2);
	    
	   if( Arrays.equals(array1,array2)==true){
	     
	     System.out.println("The Two Arrays Are Anagram");
	   }else{
	     
	     System.out.println("The Two Arrays Are Not A Anagram");
	     
	   }
	    
	    
	  }
	  
	  
	}
