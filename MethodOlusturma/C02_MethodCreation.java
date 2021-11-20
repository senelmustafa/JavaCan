package MethodOlusturma;

import java.util.Scanner;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*
		 * kullanicidan iki sayi isteyin sayilarin karelerini ve kuplerini toplayip
		 * yazdiran iki ayri method yazin kullaniciya us sorun 2 yazarsa kareleri
		 * toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayı giriniz  =");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println("us olarak 2/ 3 giriniz");
		int us = scan.nextInt();

//		kareAl(sayi1, sayi2);
//		kupAl(sayi1, sayi2);

		if (us == 3) {
			kupAl(sayi1, sayi2);
		} else if (us == 2) {
			kareAl(sayi1, sayi2);
			scan.close();
		}
		{

		}
	}

	public static void kupAl(int sayi1, int sayi2) {
		System.out.println(Math.pow(sayi1, 3) + Math.pow(sayi2, 3));
	}

	public static void kareAl(int sayi1, int sayi2) {

		System.out.println(Math.pow(sayi1, 2) + Math.pow(sayi2, 2));
	}
}