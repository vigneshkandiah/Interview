package KrishnaSandeepJavaPrograms;



class OccuranceOfCharMethod1{
	   
	   public static void main(String[] args){
	     
	     String str="HelloWorld";
	     
	     char c='l';
	     int count =0;
	     for(int i=0;i<str.length();i++){
	       
	       
	       if(str.charAt(i)==c){
	         
	         count++;
	         
	       }
	       
	     }
	     
	     System.out.println("The Occurance of the given character "+c+" is :"+count);
	     
	   }
	   
	 }
