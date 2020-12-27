package KrishnaSandeepJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class PrintVowelWordsCapsFreq{
	  
	  public static void vowelWordsCapsCount(String text){
	    
	    int vowelCount=0;
	    int wordsCount=1;
	    int capsCount=0;
	    
	    
	    for(int i=0;i<text.length();i++){
	      
	      char c =text.charAt(i);
	      
	      switch(c){
	        
	        case  ' ':
	        case  '.':
	        
	        wordsCount++;
	        
	      }
	      
	      switch(c){
	        
	        case 'A':
	        case 'E':
	        case 'I':
	        case 'O':
	        case 'U':
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u':
	        
	        vowelCount++;
	        
	      }
	      
	      if(c>=65&& c<=90){
	        capsCount++;
	        
	      }
	      
	      
	    }
	      System.out.println("The Words Count is :"+wordsCount);
	      System.out.println("The Vowel Count is :"+vowelCount);
	      System.out.println("The Caps Count is :"+capsCount); 
	    
	  }
	  
	  
	  public static void charcterFrequency(String text){
	    
	    
	    
	    Map<Character,Integer> map= new HashMap<Character,Integer>();
	    
	    for(int i=0;i<text.length();i++){
	      
	      char c=text.charAt(i);
	      
	      if(map.get(c)!=null){
	        
	        map.put(c,map.get(c)+1);
	        
	      }else{
	        map.put(c,1);
	        
	      }
	      
	    }
	    
	   for(Entry<Character,Integer> entry : map.entrySet()) {
	     
	     System.out.println("Frequency is :"+entry.getKey()+" "+entry.getValue());
	     
	   }
	    
	    
	  }
	  
	  
	  
	  
	  public static void main(String[]args){
	    
	    String text="I Love ChargeBee";
	    vowelWordsCapsCount(text);
	    
	    charcterFrequency(text);
	    
	  }
	  
	}