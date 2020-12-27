package JavaPrograms;



public class SmallestNumberInGivenArray {
	
	
	public void name() {
		
		Integer[] array= {5,6,4,3,2,1};
		
		Integer smallest=Integer.MAX_VALUE;
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]<smallest) {
				smallest=array[i];
				
			}
		}
       
		System.out.println(" The Smallest Number in the Given Array is :"+smallest);
        
	}
        
	
	public static void main(String[] args) {
		SmallestNumberInGivenArray obj= new SmallestNumberInGivenArray();
		
		obj.name();
		
	}

}
