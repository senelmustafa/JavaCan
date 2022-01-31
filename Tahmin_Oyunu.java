package Java_Ornekler;

import java.util.Scanner;

public class Tahmin_Oyunu {

	public static void main(String[] args) {
		
		
Scanner scan=new Scanner(System.in);
		
		int tahmin=0,deneme=0;
		int sayi=0;
		sayi=(int) ((Math.random()*9)+1);
		
		do {
		System.out.println("Tahmininizi Giriniz :");
		tahmin=scan.nextInt();
		
		deneme++;
		if (tahmin>sayi) {
			System.out.println("Daha Küçük Bir Sayı Giriniz:");
		}if (tahmin<sayi) {
			System.out.println("Daha Büyük Bir Sayı Giriniz :");
		}
			
		} while (tahmin!=sayi);
		System.out.println(deneme+" kadar deneme yaptınız");
		
		

	}

 }

 