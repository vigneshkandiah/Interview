package KrishnaSandeepJavaPrograms;



class CountOfWordsAndCharInString{
	  
	  
	  public static void main(String[] args){
	    
	    String text="I Love ChargeBee";
	    
	    
	    String [] words =text.split(" ");
	    
	    int countOfWords = words.length;
	    
	    System.out.println("The Number of Words in String :"+countOfWords);
	    
	   int  countOfCharacters=0;
	    
	    for(int i=0;i<words.length;i++){
	      
	      countOfCharacters =  words[i].length();
	      
	      System.out.println("The Count Of Characters in "+words[i]+" :"+countOfCharacters);
	      
	    }
	    
	  }
	  
	  
	}
