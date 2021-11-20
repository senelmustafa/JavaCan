package MethodOlusturma;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
	/*	Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
	 
	 * Kullanici 2,3 veya 4 degerini girerse, 
	kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
	
	 *Kullanici 	toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben 
	toplayamam” yazdirin.
*/
		System.out.print("işlem yapacağınız sayı adeti 2/3/4 sayılarından birini seçiniz :");	
		Scanner scan =new Scanner(System.in);
		int sayi=scan.nextInt();
		if (sayi>4) {
			sayi=5;			
		}
		switch (sayi) {
		    case 2:
		    	ikiTopla();
			break;
		    case 3:
		    	ucTopla();
			break;
		    case 4:
		    	dortTopla();
			break;
		    case 5:
		    	System.out.println("ben bu kadarını yoplayamam ┴┬├──┼");
			break;

		default:
			System.out.println("yanlış tercih tekrar deneyiniz");
			break;
		}
		
	}
		

 

	private static void dortTopla() {
		System.out.print("dort sayı giriniz :");	
		Scanner scan =new Scanner(System.in);
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println(sayi1+sayi2+sayi3+sayi4);
		
	}

	private static void ucTopla() {
		System.out.print("Üç sayı giriniz :");	
		Scanner scan =new Scanner(System.in);
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		System.out.println(sayi1+sayi2+sayi3);
		
	}

	private static void ikiTopla() {
		System.out.print("iki sayı giriniz :");	
		Scanner scan =new Scanner(System.in);
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println(sayi1+sayi2);
		
	}

}
