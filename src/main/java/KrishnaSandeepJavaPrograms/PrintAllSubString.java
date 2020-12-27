package KrishnaSandeepJavaPrograms;


	
	
	class PrintAllSubString{
		   
		   public static void main(String[] args){
		     
		     String text="abc";
		     
		     
		     for(int i=0;i<text.length();i++){
		       
		       for(int j=i+1;j<=text.length();j++){
		         
		         System.out.println(text.substring(i,j));
		       }
		       
		     }
		     
		     
		   }
		   
		 }


