package JavaPrograms;

import java.util.Scanner;

public class ReverseNumberPractice {

	public static void main(String[] args) {

		//		int num =0;
		//		int reversedNum=0;
		//
		//		System.out.println("Ener your number: ");
		//
		//		Scanner scanner = new Scanner(System.in);
		//		num=scanner.nextInt();
		//
		//
		//		
		//
		//		while(num!=0) {
		//			reversedNum= reversedNum*10;
		//
		//			reversedNum=reversedNum+num%10;
		//
		//			num=num/10;
		//
		//		}
		//
		//		System.out.println(reversedNum);


		int mysal=0;
		int mybrosal=0;

		System.out.println("Enter the MySal:");


		Scanner scan = new Scanner(System.in);

		mysal=scan.nextInt();

		System.out.println("Enter the MyBroSal:");


		Scanner scan1 = new Scanner(System.in);

		mybrosal=scan.nextInt();


		mysal= mysal*mybrosal;

		mybrosal= mysal/mybrosal;

		mysal=mysal/mybrosal;

		System.out.println(mysal);

		System.out.println(mybrosal);

	}

}
