package KrishnaSandeepJavaPrograms;

import java.util.HashSet;
import java.util.Set;

class LongestSubString{
	   
	  public static void main(String[]args){
	    
	    String str="ababdefghijjklnm";
	    System.out.println(longestSubString(str));
	    
	  }
	  
	  public static String  longestSubString(String str){
	     
	    Set<Character> set = new HashSet<Character>();
	    
	    String logesttillnow="";
	    String longestoverall="";
	    
	    
	    for(int i=0;i<str.length();i++){
	      
	      char c= str.charAt(i);
	      
	      if(set.contains(c))
	      {
	        logesttillnow="";
	        set.clear();
	        
	      }
	      set.add(c);
	        logesttillnow+=c;
	        
	        
	        
	        if(logesttillnow.length()>longestoverall.length()){
	        
	        longestoverall=logesttillnow;
	        
	      }
	      
	      
	      
	      }
	      return longestoverall;
	      
	    }
	    
	 } 
