package KrishnaSandeepJavaPrograms;



public class RecursionSum{
	   
	   public static void main(String[] args){
	     
	     System.out.println(sum(6));
	     
	   }
	   
	   
	   public static int sum(int number){
	     
	     if(number==0){
	       
	       return 0;
	     }
	     
	     return number+sum(number-1);
	     
	   }
	   
	 }
