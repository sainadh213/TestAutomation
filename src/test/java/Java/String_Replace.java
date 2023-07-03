package Java;

public class String_Replace {

	public static void main(String[] args) {
		String s = "akhdhhbd46755@#fhsksh655hg";
		
		//For Alphabates
		
		String charc = s.replaceAll("[^a-z]", "");
		System.out.println(charc);
		
		//For Numbers
		String num = s.replaceAll("[^0-9]", "");
		System.out.println(num);
		
		//For Special Char
		String spe = s.replaceAll("[0-9a-z]","");
		System.out.println(spe);
		

	}

}
