package JavaProgramsInterview;

public class SearchingAnElementUsingBinarySearch {

	public static void main(String[] args) {

		int [] givenNumArray = {1,2,3,4,6,7,8,10};

		int key=8;
		int l=0;

		int h=givenNumArray.length-1;


		

		boolean flag=false;


		while(l<=h) {
			
			int m = (l+h)/2;
			
			if(givenNumArray[m]==key) {


            System.out.println("The Element "+key+"is found");

				flag=true;

              break;
			}

			if(givenNumArray[m]<key) {

				l=m+1;


			}

			if(givenNumArray[m]>key) {

				h=m-1;
			}
 
			

		}

		
		if(flag==false)	{

			System.out.println("The Element is not found");
		}


	}

}
