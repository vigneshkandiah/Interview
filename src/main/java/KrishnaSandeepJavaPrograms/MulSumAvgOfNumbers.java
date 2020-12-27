package KrishnaSandeepJavaPrograms;



class MulSumAvgOfNumbers{
	   
	   public static void main(String[] args){
	     
	     double [] numbers ={1,3.5,4.6,5,6};
	     double sum=0;
	     double mul=1;
	     double avg=0;
	     for(int i=0;i<numbers.length;i++){
	       
	       sum=sum+numbers[i];
	       
	       mul=mul*numbers[i];
	       
	       avg=(sum/numbers.length);
	       
	       
	     }
	     
	     System.out.println("The sum of the given numbers is :"+sum);
	     System.out.println("The mul of the given numbers is :"+mul);
	     System.out.println("The avg of the given numbers is :"+avg);
	   }
	   
	 }