package KrishnaSandeepJavaPrograms;

public class TwoSumPair {
	
		  
		  public static void main(String[] args){
		    int sum=90;
		    int [] array ={10,20,30,40,50};
		    
		    for(int i=0;i<array.length;i++){
		      
		      for(int j=i+1;j<array.length;j++){
		        if(array[j]==sum-array[i]){
		          
		          System.out.println("The Pair for the given sum is :"+"("+array[i]+","+array[j]+")");
		          
		        }
		        
		      }
		    }
		    
		  }
		  
		}


