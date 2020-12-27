package JavaProgramsInterview;

import java.util.HashSet;

public class DuplicateElementsUsingHashSet {
	
	
	public void isDuplicates() {
		
		
		String[] languages= {"sql","python","groovy","java","ruby"};
		boolean status=false;
		HashSet<String> set= new HashSet<String>();
		for (int i = 0; i < languages.length; i++) {
			
			boolean add = set.add(languages[i]);
			
			if(add==false) {
				
				System.out.println("The Found duplicate element in the given Array :"+languages[i]);
				
				status=true;
				
				
			}
		}
		
		if(status==false) {
			System.out.println("No duplicate element in the given Array");
		}
		
	}
	
	public static void main(String[] args) {
		DuplicateElementsUsingHashSet obj= new DuplicateElementsUsingHashSet();
		obj.isDuplicates();
	}

}
