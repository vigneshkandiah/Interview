package KrishnaSandeepJavaPrograms;

class LargestOfThreeTernary{
	  
	  public static void main(String[] args){
	    
	    int n1=100;
	    int n2=200;
	    int n3=300;
	    int largest=0;
	    
	    largest=n1>n2?n1:n2;
	    
	    largest=largest>n3?largest:n3;
	    
	    System.out.println("The Largest Of three is :"+largest);
	    
	    
	  }
	  
	}