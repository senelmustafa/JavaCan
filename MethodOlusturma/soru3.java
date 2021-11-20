package MethodOlusturma;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Email kontrolu yapan bir program yazin. Kullanicinin girdigi sifre
		 * - @ isareti icermiyorsa gecersiz email yazdirin - @gmail.com icermiyorsa
		 * “lutfen gmail adresinizi girin” yazdirin - @gmail.com ile bitmiyorsa “Yazimda
		 * bir sorun var, maili kontrol ediniz
		 * 
		 */
		System.out.print("şifrenizi giriniz :");
		Scanner scan = new Scanner(System.in);
		String sifre = scan.next();
		if (!sifre.contains("@")) {
			System.out.println("lütfen gmail hesabınızı giriniz");
		} else if (!sifre.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi girin");
		} else if (!sifre.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		} else {
			System.out.println("şifre doğru");
		}
	}

}
