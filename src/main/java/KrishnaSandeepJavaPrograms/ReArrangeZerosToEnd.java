package KrishnaSandeepJavaPrograms;



class ReArrangeZerosToEnd{
	  
	  public static void main(String[] args){
	    
	    int num[]={4,5,0,7,0,4,3};
	    
	    int numrearrange[]= new int[num.length];
	    
	    rearrange(num,numrearrange);
	    
	    print(numrearrange);
	   
	  }
	  
	  
	  public static void rearrange(int[] num,int[]numrearrange){
	    int j=0;
	    for(int i=0;i<num.length;i++){
	      if(num[i]!=0){
	        
	        numrearrange[j]=num[i];
	        j++;
	      }
	    }
	      
	      for(int i=0;i<num.length;i++){
	      if(num[i]==0){
	        
	        numrearrange[j]=num[i];
	        j++;
	      }
	      
	    }
	    }
	  
	    public static void print(int [] numrearrange){
	      
	      for(int i=0;i<numrearrange.length;i++){
	        
	        System.out.println(numrearrange[i]);
	        
	      }
	      
	    }
	    
	  }
