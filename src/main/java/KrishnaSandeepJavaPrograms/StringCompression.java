package KrishnaSandeepJavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class StringCompression{
	  
	  public static void main(String[] args){
	    
	    String givenString="aaabbbccxddfgggghj";
	    
	    
	    Map<Character,Integer> map = new LinkedHashMap<>();
	    
	    for(int i=0;i<givenString.length();i++){
	      
	     if(map.get(givenString.charAt(i))!=null){
	        
	        map.put(givenString.charAt(i),map.get(givenString.charAt(i))+1);
	        
	      }else{
	        
	        map.put(givenString.charAt(i),1);
	      }
	      
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(Entry<Character,Integer> entry : map.entrySet()){
	      
	      sb.append(entry.getKey());
	      sb.append(entry.getValue());
	      
	    }
	    
	    System.out.println(sb.toString());
	  }
	  
	}
