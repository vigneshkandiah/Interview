package KrishnaSandeepJavaPrograms;

class IsRotatedString{
	   
	   public static void main(String[] args){
	     
	     System.out.println("The Strings are rotated :"+isRotated("abcd","bcda"));
	     
	   }
	   
	   public static boolean isRotated(String original,String rotated){
	     
	     if(original==null||rotated==null){
	       
	       return false;
	       
	     }else if(original.length()!=rotated.length()){
	       
	       return false;
	     
	     }else{
	       
	       String concatenated=original+original;
	       
	       return(concatenated.contains(rotated));
	       
	     }
	     
	   }
	   
	   
	 }