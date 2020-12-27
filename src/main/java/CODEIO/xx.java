package CODEIO;

class xx{
	
	
	
	public void name() {
		
int givenNum=121;
	    
	    int newNum=0;
	    
	    
	    while(givenNum!=0) {
	    	newNum= newNum*10;
			
	    	newNum=newNum+givenNum%10;
			
	    	givenNum=givenNum/10;
			
					}
	  

	       if(givenNum==newNum) {
	    	   
	    	   System.out.println("The Number is Palindrome");
	       }else {
	    	   System.out.println("The Number is not a Palindrome"); 
	    	   
	       }
		
		
		
		
	}
	   public static void main(String[] args){
	     
		   xx ob= new xx();
		   ob.name();
	     
	     
	   }
	   
	 }