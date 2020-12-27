package KrishnaSandeepJavaPrograms;

class Anagram{
	  
	  public static void main(String[] args){
	    
	    String text1="Hello";
	    
	    String text2="holleH";
	    
	    char [] array1=text1.toCharArray();
	    char [] array2=text2.toCharArray();
	    int index =0;
	    if(array1.length!=array2.length){
	      
	      System.out.println("The Two strings are Not Anagram");
	    }else{
	      
	      StringBuilder sb= new StringBuilder(text2);
	      
	      for(char c: array1){
	        
	        index = sb.indexOf(String.valueOf(c));
	        
	        if(index!=-1){
	          
	          sb.deleteCharAt(index);
	          
	          
	          
	        }else{
	          
	          System.out.println("The Two strings are Not Anagram");
	          
	        }
	        
	      }
	      
	      if(sb.length()==0){
	        System.out.println("The Two strings are  Anagram");
	        
	      }else{
	        System.out.println("The Two strings are not Anagram");
	      }
	    
	  }
	}
	 
	}