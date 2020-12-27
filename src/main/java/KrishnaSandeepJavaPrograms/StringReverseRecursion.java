package KrishnaSandeepJavaPrograms;


class StringReverseRecursion{
	   
	   public static void main(String[] args){
	     
	     String test="Sandy";
	     
	    System.out.println(recursionreverse(test));
	     
	     
	     
	   }
	   
	   public static String recursionreverse(String test){
	     if(test==null||test.length()<=1){
	       
	       return test;
	     }
	     
	     return recursionreverse(test.substring(1))+test.charAt(0);
	   }
	   
	 }
