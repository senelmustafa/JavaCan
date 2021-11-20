package day06_wrapper;

import java.util.Scanner;

public class C07_BasitIf {

	public static void main(String[] args) {
		// haftanın gün isimlerini alıp 
		//hafta içi mi hafta sonu mu olduğunu yazınız
		
		
		System.out.println("haftanın günlerini giriniz =");
		Scanner scan=new Scanner(System.in);
		String gun=scan.next().toLowerCase();
		//string matematiksel non primitive olduğu için == kullanılamaz.
		
		//string  non primitive olduğu için equals metodunu kullanarak günü atıyoruz
		
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("hafta sonu");
		}
		if (gun.equals("pazartesi") || gun.equals("salı")  || gun.equals("salı")
				|| gun.equals("Çarşamba ") || gun.equals("Perşembe") || gun.equals("Cuma")) {
			System.out.println("hafta İçi Bir gün gürdiniz");
		}
	}

}
