package KrishnaSandeepJavaPrograms;

import java.math.BigInteger;

class BigIntegerFactorial{
	  
	  public static void main(String[] args){
	    BigInteger fact= BigInteger.ONE;
	    int n=20;
	    
	    for(int i=1;i<=n;i++){
	      
	      fact=fact.multiply(BigInteger.valueOf(i));
	    }
	    
	    System.out.println(fact);
	  }
	  
	}