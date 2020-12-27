package JavaPrograms;

public class SwapNumbers {

	public static void main(String[] args) {

		int mySalary=75000;

		int myBrotherSalary=300000;

		System.out.println(" --------Before Swaping----------");

		System.out.println("My Salary: "+mySalary);

		System.out.println("MyBrother Salary :"+myBrotherSalary);

		int temp=mySalary;

		mySalary=myBrotherSalary;

		myBrotherSalary=temp;


		System.out.println(" --------After Swaping----------");

		System.out.println("My Salary: "+mySalary);

		System.out.println("MyBrother Salary :"+myBrotherSalary);


	}

}
