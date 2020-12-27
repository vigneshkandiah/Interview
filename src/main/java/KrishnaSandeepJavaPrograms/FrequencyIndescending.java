package KrishnaSandeepJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class FrequencyIndescending{
	   
	   public static void main(String[] args){
	     
	     String text="aaabbbbhhhjjjjjj";
	     
	     Map<Character,Integer> map= new HashMap<Character,Integer>();
	     
	     Integer value = 0;
	     
	     
	     
	     for(int i=0;i<text.length();i++){
	       
	       char c=text.charAt(i);
	       
	       value=map.get(c);
	       
	       
	       if(value!=null){
	         map.put(c,value+1);
	         
	       }else{
	         
	          map.put(c,1);
	         
	       }
	       
	     }
	     
	     System.out.println(map.entrySet());
	     
	     
	     Set<Entry<Character,Integer>> set = map.entrySet();
	     
	     List<Entry<Character,Integer>> list= new ArrayList<Entry<Character,Integer>>(set);
	     
	    Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getKey().compareTo(o1.getKey());
			}
		});
	     for(Entry<Character,Integer> entry:list){
	       
	       System.out.println("The Frequency of occurance"+entry.getKey()+" "+entry.getValue());
	       
	     }
	     
	     
	   }
	   
	 }

