package KrishnaSandeepJavaPrograms;

import java.util.Arrays;

class CharacterSort{
	  public static void main(String[] args){
	    
	    
	    String text="cba";
	    char [] array = text.toCharArray();
	    
	    Arrays.sort(array);
	    String result="";
	    for(char each:array){
	     
	     result=result+each;
	      
	    }
	    
	    System.out.println(result.toString());
	    
	  }
	  
	}
