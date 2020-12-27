package KrishnaSandeepJavaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

class DuplicateCharInString{
	  
	  public static void main(String[] args){
	    
	    String test="vigneeshkandiahh";
	    
	    
	    HashMap<Character,Integer> map= new HashMap<Character,Integer>();
	    
	    char [] array =test.toCharArray();
	    
	    for(char each:array){
	      
	      if(map.get(each)!=null){
	        
	        map.put(each,map.get(each)+1);
	        
	      }else{
	        
	        map.put(each,1);
	      }
	      
	    }
	    
	    for(Entry<Character, Integer> entry:map.entrySet()){
	      
	      if(entry.getValue()>1){
	        
	       // System.out.println(entry.getKey()+":"+entry.getValue());
	        
	         System.out.println(entry.getKey()+entry.getValue().toString());
	        
	      }
	      
	    }
	    
	  }
	  
	}
