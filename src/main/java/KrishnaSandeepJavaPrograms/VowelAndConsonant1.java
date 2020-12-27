package KrishnaSandeepJavaPrograms;

class VowelAndConsonant1{
	  
	  public static void main(String[] args){
	    String givenString="Vigneshkandiah";
	  
	  givenString=givenString.toUpperCase();
	  
	  int vowelCount=0;
	  int consonantCount=0;
	  
	  for(int i=0;i<givenString.length();i++){
	    
	    if(givenString.charAt(i)=='A'
	    ||givenString.charAt(i)=='E'
	    ||givenString.charAt(i)=='I'
	    ||givenString.charAt(i)=='O'
	    ||givenString.charAt(i)=='U'){
	      
	      vowelCount++;
	    }else{
	      consonantCount++;
	      
	    }
	  }
	  
	  System.out.println("The vowel Count is :"+vowelCount);
	  System.out.println("The Consonant Count is :"+consonantCount);
	  
	    
	    
	  }
	}