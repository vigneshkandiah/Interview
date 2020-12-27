package KrishnaSandeepJavaPrograms;


class FactorsofEachNumber{
	  
	  public static void main(String[] args){
	    
	    int n=7;
	    
	    for(int i=1;i<=n;i++){
	      System.out.println("The Factors of :"+i+"is :");
	      for(int j=1;j<=i;j++){
	        
	        if(i%j==0){
	          
	          System.out.println(" "+j);
	          
	        }
	      }
	      
	    }
	    
	  }
	}
