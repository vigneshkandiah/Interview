package KrishnaSandeepJavaPrograms;



class Palindrome{
	  
	  public static void main(String[] args){
	    
	    
	    String text="aba";
	    
	    String reverse="";
	    
	    for(int i=text.length()-1;i>=0;i--){
	      
	      reverse=reverse+text.charAt(i);
	    }
	    
	    if(text.equals(reverse)){
	      
	      System.out.println("The String is Palindrome");
	    }else{
	      
	      System.out.println("The String is Not a  Palindrome");
	      
	    }
	    
	  }
	  
	}
