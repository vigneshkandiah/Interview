package KrishnaSandeepJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class MajorityEelementInArray{
		  
	public static void main(String[] args){
	    
	    int [] array={4,5,6,7,4,4,4};
	    
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    
	    for(int i =0; i<array.length;i++){
	      
	      map.put(array[i],map.getOrDefault(array[i],0)+1);
	      
	    }
	    
	    for(Entry<Integer,Integer> entry:map.entrySet()){
	      
	      if(entry.getValue()>array.length/2){
	        
	        int result= entry.getKey();
	        
	        System.out.println("The Majority Number in the array is :"+result);
	        
	      }
	      
	    }
	    
	  }
		  
		}
		    


