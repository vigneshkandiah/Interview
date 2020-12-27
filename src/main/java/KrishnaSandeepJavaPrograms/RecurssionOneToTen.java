package KrishnaSandeepJavaPrograms;



class RecurssionOneToTen{
	  
	  public static void main(String[] args){
	    
	    printNumbers(1);
	    
	  }
	  
	  public static void printNumbers(int n){
	    
	    if(n<=10){
	      
	      System.out.println(n);
	      
	      printNumbers(1+n);
	      
	    }
	    
	    
	  }
	  
	}
