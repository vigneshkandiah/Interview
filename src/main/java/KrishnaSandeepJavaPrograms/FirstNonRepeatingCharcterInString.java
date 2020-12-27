package KrishnaSandeepJavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class FirstNonRepeatingCharcterInString{
	   
	   public static void main(String[] args){
	     
	     String text="aabbbbdddeefghh";
	     
	     
	     
	    LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	    
	    
	    for(int i=0;i<text.length();i++){
	      
	    
	      if(map.get(text.charAt(i))!=null){
	        
	        map.put(text.charAt(i),map.get(text.charAt(i))+1);
	      }else{
	        
	       map.put(text.charAt(i),1);
	      
	        
	        
	      }
	    }
	    
	    for(Entry<Character,Integer> entry:map.entrySet()){
	      
	      if(entry.getValue()<2){
	        
	        System.out.println("The First Non Repeating Character in the given String is :"+entry.getKey());
	        break;
	        
	      }
	      
	    }
	     
	   }
	   
	   
	 }
