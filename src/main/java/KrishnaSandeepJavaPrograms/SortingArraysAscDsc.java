package KrishnaSandeepJavaPrograms;

import java.util.Arrays;
import java.util.Collections;



class SortingArraysAscDsc{
	  public static void main(String[] args){
	    
	    String array[] ={"Java","SQL","Python","Groovy"};
	    
	    String array1[]={"one","two","three","four"};
	    
	    for(String each:array){
	      
	      System.out.println(each);
	      
	    }
	    
	    System.out.println("==========After Ascending Sorting ===============");
	    
	    Arrays.sort(array);
	    
	    for(String each:array){
	      
	      System.out.println(each);
	      
	    }
	    System.out.println("==================================================");
	    for(String each:array1){
	      
	      System.out.println(each);
	      
	    }
	    
	    System.out.println("==========After Descending Sort ==================");
	    
	    Arrays.sort(array1,Collections.reverseOrder());
	    
	    for(String each:array1){
	      
	      System.out.println(each);
	      
	    }
	    
	  }
	  
	}

