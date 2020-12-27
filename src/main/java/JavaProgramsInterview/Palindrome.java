package JavaProgramsInterview;



public class Palindrome{
	   public static void main(String[] args){
	     
	    int givenNum=111;
	    int num=0;
	    num=givenNum;
	    
	    int newNum=0;
	    
	    
	  while(num!=0){
	    
	    newNum=newNum*10;
	    newNum=newNum+num%10;
	    num=num/10;
	    
	 
	    
	  }
	  

	  
	     
	     if(givenNum==newNum){
	       
	       System.out.println("The Number is a Palindrome");
	     }else{
	       System.out.println("The Number is Not a Palindrome");
	       
	     }
	   }
	   
}