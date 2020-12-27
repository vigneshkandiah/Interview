package KrishnaSandeepJavaPrograms;

class MissingNumber1{
	  
	  public static void main(String[] args){
	    
	    int n[] = {1,2,4,5,6,7};
	    
	    int sum=0;
	    for(int i=0;i<n.length;i++){
	      
	      sum=sum+n[i];
	      
	    }
	    
	    int expectedArrayl=n.length+1;
	    int expectedsum=0;
	    for(int i=0;i<=expectedArrayl;i++){
	      
	      expectedsum=expectedsum+i;
	      
	      
	    }
	    
	    System.out.println("The Missing Number is :"+(expectedsum-sum));
	    
	    
	    
	    
	    
	  }
	  
	  
	  
	}
