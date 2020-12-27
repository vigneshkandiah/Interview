package KrishnaSandeepJavaPrograms;

class ReverseEachWordsInString{
	  
	  public static void main(String[] args){
	    
	    String test="I LOVE CHARGEBEE";
	    
	    
	    String [] words =test.split(" ");
	    
	    
	    for(String each:words){
	      String reverse="";
	      for(int i=each.length()-1;i>=0;i--){
	        
	        reverse=reverse+each.charAt(i);
	        
	      }
	      System.out.print(reverse+" ");
	    }
	    
	    
	    
	    
	  }
}