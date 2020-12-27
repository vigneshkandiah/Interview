package KrishnaSandeepJavaPrograms;

class Anagram1{
	  
	  public static void main(String[] args){
	    
	    String text1="abc";
	    String text2="cea";
	    int index=0;
	    char array [] = text1.toCharArray();
	    
	    boolean flag= false;
	    
	    
	    if(text1.length()!=text2.length()){
	      
	      flag=false;
	      
	    }else{
	      
	      StringBuilder sb = new StringBuilder(text2);
	      
	      for(char c:array){
	        
	        index=sb.indexOf(String.valueOf(c));
	          if(index!=-1){
	          
	          sb.deleteCharAt(index);
	          
	        }
	        if(sb.length()==0){
	        
	        	flag=true;
	        
	      }else{
	        
	        flag=false;
	      }
	          
	        }
	        
	        
	        
	      }
	      
	    if(flag==true) {
	    	
	    	System.out.println("The Two Strings are  Anagram");
	    }else {
	    	
	    	System.out.println("The Two Strings are Not  Anagram");
	    }
	      
	      
	      
	    }
	    
	    
	    
	    
	  }