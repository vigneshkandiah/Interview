package KrishnaSandeepJavaPrograms;

import java.util.Stack;

class ReverseWords{
	  
	  
	  public static void reverseWords(String text){
	     
	     Stack<Character> st= new Stack<Character>();
	     
	     for(int i=0;i<text.length();i++) {
	       
	       if(text.charAt(i)!=' '){
	         
	         st.push(text.charAt(i));
	         
	       }else{
	         
	         while(st.empty()==false){
	         
	         System.out.println(st.pop());
	         
	       }
	       
	       System.out.println(" ");
	       
	       
	         
	       } 
	       
	     }
	      
	     while(st.empty()==false){
	         
	         System.out.println(st.pop());
	      
	    }
	  }
	  public static void main(String[] args){
	    
	    String text="Hello World";
	    reverseWords(text);
	    
	  }
	  
	}

