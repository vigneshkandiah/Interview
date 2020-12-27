package JavaProgramsInterview;

public class RemoveJunkValues {
	
	
	public static void main(String[] args) {
		
		
		String s="sjhflhfh/hh^%^%(^%*%^%^#^^$GHKGHHGH#%#*%*%";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(s);
	}

}
