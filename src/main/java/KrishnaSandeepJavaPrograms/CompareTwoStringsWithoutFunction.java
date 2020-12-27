package KrishnaSandeepJavaPrograms;

class CompareTwoStringsWithoutFunction{
	  
	  public static void main(String[] args){
	    
	    String text1="I LOVE CHARGEBEE";
	    
	    String text2="I LOVE CHARGEBEE";
	    
	    boolean flag=true;
	    
	    if(text1.length()!=text2.length()||text1==null||text2==null){
	      
	      System.out.println("The Two Strings are not Equal");
	      
	      
	    }else{
	      
	      for(int i=0;i<text1.length();i++){
	      
	      
	        
	        if(text1.charAt(i)!=text2.charAt(i)){
	          
	          flag=false;
	          
	          
	        }
	        
	      }
	    
	    
	    if(flag==true){
	      
	      System.out.println("The Two Strings are Equal");
	      
	    }else{
	      
	      System.out.println("The Two Strings are not Equal");
	    }
	    }
	    
	  }
	  
	  
	}
