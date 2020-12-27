package KrishnaSandeepJavaPrograms;

class EvenLetterWords{
	  
	  public static void main(String[] args){
	    
	    String text="Hell World Hi Iam Vickii";
	    
	    String [] array =text.split(" ");
	    for(int i=0;i<array.length;i++){
	    if(array[i].length()%2==0){
	      
	      System.out.println(array[i]);
	      
	    }
	    
	    
	  }
	  
	}
	  
	}
