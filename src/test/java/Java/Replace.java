package Java;

public class Replace {

	public static void main(String[] args) {
		String s="sainadh213@gmail.com";
		//String ss = s.replaceAll("[a-z0-9]", "");
		String a = s.replaceAll("[0-9]", "");
		System.out.println(a);
		//For printing only integer values
		String num = s.replaceAll("[^0-9]","");
		System.out.println(num);
		//For printing only char values
				String chara = s.replaceAll("[^a-z]","");
				System.out.println(chara);
				//For printing only special char
				String sp = s.replaceAll("[0-9a-z]","");
		System.out.println(sp);

	}

}
