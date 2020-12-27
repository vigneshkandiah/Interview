package KrishnaSandeepJavaPrograms;



class ReverseNumberUsingForLoop{
	  
	  public static void main(String[] args){
	    
	    int num=123;
	    
	    String stringNumber= String.valueOf(num);
	    
	    for(int i=stringNumber.length()-1;i>=0;i--){
	      
	      System.out.print(stringNumber.charAt(i));
	      
	    }
	    
	  
	  
	}
	} 
