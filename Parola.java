import java.util.Scanner;

public class Parola {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen Kullanıcı Adınızı Giriniz :");
		String kAdi=scan.next();
		
		System.out.print("Lütfen Parolanızı Giriniz :");
		String parola=scan.next();
		
//		kAdi="mustafa";
//		parola="1234";
		
		if(kAdi.equals("admin") && parola.equals(parola.replace("\\d","*"))){
			System.out.println("***Hoşgeldiniz***");
			System.out.println(kAdi+" "+parola.replaceAll("\\w","*"));
		}else {
			System.out.println("Kullanıcı Adı veya Parola Yanlış Lütfen Yeniden Deneyiniz...");
		
		}
	}

}
