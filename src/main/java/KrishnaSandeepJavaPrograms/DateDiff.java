package KrishnaSandeepJavaPrograms;

import java.time.LocalDate;
import java.time.Period;

class DateDiff{
	  
	  public static void main(String[] args){
	    
	    LocalDate date1= LocalDate.of(2020,10,01);
	    
	    LocalDate date2 = LocalDate.of(2019,10,01);
	     
	    Period period =Period.between(date2,date1);
	    
	    System.out.println(period.getYears());
	    
	    
	  }
	  
	  
	}