package day06_wrapper;

import java.util.Scanner;

public class C05_BasitIf {

	public static void main(String[] args) {
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		System.out.println("haftanın günlerin ilk harfini yazınız =");
		Scanner scan=new Scanner(System.in);
		//Kullanıcının girdiği verinin tamamını küçük veya bütük harf yapabiliriz. 
		//toUpperCase - toLowercase büyük küçük harf olarak yapar..
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazartesi -Perşembe- Pazar");
		}
		if (ilkHarf=='S') {
			System.out.println("Salı ");
			
		}
		if (ilkHarf=='C' || ilkHarf=='c') {
			System.out.println("CARŞAMBA CUMA CUMARTESİ");
		} 
	
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
			System.out.println("Geçersiz Harf Girdiniz.\nLütfen Gün İsimlerinden birini giriniz.");
			
		}
	}
	

}
