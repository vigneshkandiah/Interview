package KrishnaSandeepJavaPrograms;

class VowelAndConsonant{
	  
	  public static void main(String[] args){
	    
	    
	    String text="Vigneshkandiah";
	    
	    countVowel(text);
	    
	    
	  }
	  
	  
	  public static void countVowel(String text){
	    
	    int countVowel=0;
	    int countConsonant=0;
	    
	    for(int i=0;i<text.length();i++){
	      if(isVowel(text.charAt(i))){
	        
	        countVowel++;
	        
	      }else{
	        
	        countConsonant++;
	        
	      }
	      
	    }
	    
	    System.out.println("The Vowel Count is :"+countVowel);
	    System.out.println("The Consanant Count is :"+countConsonant);
	    
	  }
	  
	  public static boolean isVowel(char ch){
	    
	    ch=Character.toUpperCase(ch);
	    
	    return(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
	   
	  }
	  
	  
	}
