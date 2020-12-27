package KrishnaSandeepJavaPrograms;



class PerfectSqaure{
	   
	   public static void main(String[]Args){
	     boolean flag=true;
	     int n=36;
	     
	     for(int i=1;i<=n/2;i++){
	       if(i*i==n){
	         
	         System.out.println("The Given num is square of :"+i);
	         flag=true;
	         
	         
	       }else{
	         flag=false;
	       }
	       
	     }
	     
	     if(flag==true){
	       
	       System.out.println("The Given num is a perfect sqaue");
	     }else{
	       System.out.println("The Given num is not a perfect sqaure");
	     }
	     
	   }
	 }
