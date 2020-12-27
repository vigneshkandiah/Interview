package KrishnaSandeepJavaPrograms;



class FirstDigitAndLastDigit{
	   
	   public static void main(String[]args){
	     
	     int n=1997;
	     
	     int lastdigit=n%10;
	     
	     int firstdigit=n;
	     while(firstdigit>=10){
	       
	       firstdigit=firstdigit/10;
	       
	       
	       
	       
	     }
	     
	     System.out.println(lastdigit+firstdigit);
	     
	   }
	 }
