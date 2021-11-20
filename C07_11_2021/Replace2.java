package C07_11_2021;

public class Replace2 {

	public static void main(String[] args) {
		String str="Java öğrenmek çok zevkli";
		
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replace("öğrenmek","kod yazmak"));
		System.out.println(str.replace("Java", "Kod"));
		System.out.println(str.replace("z", ""));
	}

}
