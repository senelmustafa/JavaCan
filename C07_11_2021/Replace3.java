package C07_11_2021;

public class Replace3 {

	public static void main(String[] args) {
		String cumle="Java     çok      zevkli";
		
		cumle=cumle.replaceAll("\s+"," ");
		
		System.out.println(cumle);
		cumle=cumle.replaceAll("[a-k]"," ");
		System.out.println(cumle);
		cumle=cumle.replaceAll("\\s","*");
		System.out.println(cumle);
		cumle=cumle.replaceAll("\\S","*");
		System.out.println(cumle);
	}

}
