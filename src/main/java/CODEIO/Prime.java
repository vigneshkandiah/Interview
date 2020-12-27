package CODEIO;

class Prime{
	   
	   int givenNumber=17;
	  
	   int count=0;
	   
	   for(int i=1;i<=givenNumber;i++){
	     
	     if(givenNumber!=0 && givenNumber%i==0){
	       
	       count++;
	       
	       
	     }else{
	       System.out.println("The Number is not a Prime Number");
	       
	     }
	     
	     
	     
	   }
	   
	   if(count==2){
	     System.out.println("The Number is a Prime Number");
	     
	   }
	   
	   System.out.println("The Number is not a Prime Number");
	   
	   
	 }
}

