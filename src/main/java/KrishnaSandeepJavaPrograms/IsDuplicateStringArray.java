package KrishnaSandeepJavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class IsDuplicateStringArray{
	   
	   public static void main (String[] args){
	     
	     String [] languages = new String [] {"Java","C","C++","SQL"};
	     
	     List list =Arrays.asList(languages);
	     
	     Set set = new HashSet<>(list);
	     
	     if(set.size()!=list.size()){
	       
	       
	       System.out.println("The Are Duplicats in Array");
	     }else{
	       System.out.println("The Are No Duplicats in Array");
	       
	     }
	     
	     
	     
	     
	     
	     
	   }
	   
	 }
