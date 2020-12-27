package KrishnaSandeepJavaPrograms;

import java.util.Stack;

class StringsWellFormed{
	   
	   public static void main(String[] args){
	     
	     String text="{()}";
	     
	     Stack<Character> st= new Stack<Character>();
	     for(int i=0;i<text.length();i++){
	       
	       char ch=text.charAt(i);
	       
	       if(st.empty()){
	         
	         st.push(ch);
	         
	       }else if(ch=='{'||ch=='('||ch=='['){
	         
	         st.push(ch);
	       }else if(ch=='}' && st.peek()=='{'){
	         st.pop();
	         
	       }else if(ch==')'&& st.peek()=='('){
	         st.pop();
	         
	       }else if(ch==']'&& st.peek()=='['){
	         st.pop();
	         
	       }
	       
	       
	     }
	     
	     if(st.empty()){
	       
	       System.out.println("The Strings are wellformed");
	     }else{
	       System.out.println("The Strings are not wellformed");
	       
	     }
	     
	   }
	   
	   
	 }
