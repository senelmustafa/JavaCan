package MethodOlusturma;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun
		 */

		System.out.print("Lütfen Adınızı Giriniz :");
		Scanner scan = new Scanner(System.in);
		String adi = scan.next();
		System.out.print("Lütfen Soyadınızı Giriniz :");
		String soyadi = scan.next();
		System.out.print("Lütfen Şifrenizi Giriniz :");
		String kkrt = scan.next();

//		adiSoyadi(adi,soyadi);
//		kart(kkrt);
		System.out.println(adiSoyadi(adi, soyadi));
		System.out.println(kart(kkrt));
	}

	private static String kart(String kkrt) {
		kkrt = kkrt.substring(0, 4) + " " + kkrt.substring(4, 8) + " " + kkrt.substring(8, 12) + " "
				+ kkrt.substring(12);
		return kkrt;
	}

	private static String adiSoyadi(String adi, String soyadi) {
		adi = adi.substring(0, 1).toUpperCase() + adi.substring(1).toLowerCase();
		soyadi = soyadi.substring(0, 1).toUpperCase() + soyadi.substring(1).toLowerCase();

		return adi + " " + soyadi;

	}

}
