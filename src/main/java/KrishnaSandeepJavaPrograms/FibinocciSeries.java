package KrishnaSandeepJavaPrograms;

class FibinocciSeries{
	  
	  public static void main(String[] args){
	    
	    int n1=0;
	    int n2=1;
	    int sum=0;
	    
	    int till=8;
	    
	    for(int i=1;i<=till;i++){
	    System.out.print(n1+" ");
	      sum=n1+n2;
	      n1=n2;
	      n2=sum;
	      
	    }
	    
	    
	    
	  }
	}
