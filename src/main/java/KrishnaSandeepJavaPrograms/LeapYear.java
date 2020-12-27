package KrishnaSandeepJavaPrograms;



class LeapYear{
	  
	  public static void main(String[] args) {
	  
	  int year=1992;
	  
	  if((year%400==0)||(year%4==0)&&(year%100!=0)){
	    
	    System.out.println("The Year is a Leap Year");
	    
	  }else {
		  System.out.println("The Year is not a Leap Year");
		  
	  }
	  
	}
}
