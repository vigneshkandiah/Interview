package KrishnaSandeepJavaPrograms;

class Panagrom{
	  
	  public static void main(String[] args){
	    
	    String givenString="Sphinx of black quartz, judge my vow.";
	    
	    givenString=givenString.toLowerCase();
	    boolean flag =true;
	    if(givenString.length()<26){
	      
	      System.out.println("The Given String is not a Panagram");
	      
	    }else{
	      
	      for(char ch='a';ch<='z';ch++){
	        
	        if(givenString.indexOf(ch)<0){
	          
	          flag = false;
	          
	        }
	        
	      }
	      
	    }
	    
	    if(flag==true){
	      
	      System.out.println("The Given String is a Panagram");
	    }else{
	      
	      System.out.println("The Given String is not a Panagram");
	      
	    }
	    
	  }
	  
	}
