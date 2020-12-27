package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;

import Collection.SET.HashSET;

public class MissingAlphabets {
	
	public static void main(String[] args) {
		
		String givenString= "b";
		
		givenString=givenString.toLowerCase();
		
		
		givenString=givenString.replaceAll(" ", "");
		
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		
		
		
		
		String [] compareArray=alphabets.split("");
		
		
		String [] userArray=givenString.split("");
		
//		HashSet<String> set1= new HashSet<String>();
//		
//		
//	      for (String each : userArray) {
//			
//	    	  set1.add(each);
//		}
		
		
		HashSet<String> set1= new HashSet<String>(Arrays.asList(userArray));
		
		HashSet<String> set2= new HashSet<String>(Arrays.asList(compareArray));
		
		
		 set2.removeAll(set1);
		 
		 for (String each : set2) {
			 
			 
			 System.out.print(each+" ");
			
		}
			
		}
		
		
	}
	
	
	
	
	


