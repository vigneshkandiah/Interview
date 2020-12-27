package KrishnaSandeepJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class SortingMap{
	  
	  public static void main (String[]args){
	    
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    
	    map.put('A',9);
	    map.put('D',3);
	    map.put('Z',5);
	    map.put('L',2);
	    map.put('N',6);
	    
	   System.out.println("--------------Before Sorting --------------------");
	    
	    for(Entry<Character,Integer> entry:map.entrySet()){
	      
	      System.out.println(entry.getKey()+"--"+entry.getValue());
	    }
	    System.out.println("--------------After Sorting --------------------");
	    TreeMap<Character,Integer> map1= new TreeMap<Character,Integer>(map);
	    
	    for(Entry<Character,Integer> entry:map1.entrySet()){
	      
	      System.out.println(entry.getKey()+"--"+entry.getValue());
	    }
	    
	  }
	  
	}