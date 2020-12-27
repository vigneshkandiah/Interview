package KrishnaSandeepJavaPrograms;



class FirstCharcterOfString{
	  
	  public static void main(String[]args){
	    
	    String text="I Love ChargeBee For No Reason";
	    
	    printFirstChar(text);
	    
	  }
	  
	  public static void printFirstChar(String text){
	    
	   String [] words=text.split(" ");
	   
	   for(int i=0;i<words.length;i++){
	     
	     String s=words[i];
	     
	     System.out.print(s.charAt(0)+" ");
	     
	   }
	    
	  }
	  
	}