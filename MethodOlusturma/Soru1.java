package MethodOlusturma;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Soru 1)Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini, 100’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */

		System.out.println("lütfen bir sayı giriniz :");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();

		tekCift(sayi);
		buyukKucuk(sayi);
		basamaklar(sayi);

		scan.close();

	}

	private static void basamaklar(int sayi) {
		System.out.println(
				sayi > 100 && sayi < 999 ? sayi > 100 ? (sayi % 10 + sayi / 10 % 10 + sayi / 100 % 10) : (sayi % 10)
						: "lütfen 3 basamaklı sayı giriniz");

	}

	private static void buyukKucuk(int sayi) {
		System.out.println(sayi == 0 ? "sayı sıfırdır" : sayi > 0 ? "sayı  0 dan büyüktür" : "sayi 0 dan küçüktür. ");

	}

	private static void tekCift(int sayi) {
		System.out.println(sayi % 2 == 0 ? "sayı çiftir" : "sayı tek sayıdır");

	}
}
