package KrishnaSandeepJavaPrograms;



class OccuranceofCharMethod2{
	   
	   public static void main(String[] args){
	     
	     String str="HelloWorld";
	     int l1=str.length();
	     str=str.replaceAll("l","");
	     int l2=str.length();
	     System.out.println(l1-l2);
	     
	   }
	   
	 }
