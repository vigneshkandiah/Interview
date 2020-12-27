package JavaPrograms;

public class SwapTwoNumbersWithoutThirdVariable2 {
	
	public static void main(String[] args) {
		
		int mySalary=1000;
		
		int myBrotherSalary=2000;
		
		System.out.println(" --------Before Swaping----------");

		System.out.println("My Salary: "+mySalary);

		System.out.println("MyBrother Salary :"+myBrotherSalary);
		
		
		mySalary=mySalary*myBrotherSalary;
		
		myBrotherSalary=mySalary/myBrotherSalary;
		
		mySalary=mySalary/myBrotherSalary;
		System.out.println(" --------Before Swaping----------");

		System.out.println("My Salary: "+mySalary);

		System.out.println("MyBrother Salary :"+myBrotherSalary);
		
		
	}

}
