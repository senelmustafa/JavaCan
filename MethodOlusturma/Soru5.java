package MethodOlusturma;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*Soru : Bir oyun programinda oyuncuya level ve puanina gore bonus hesaplayan bir method yaziniz.
		
		Bonus eklendikten sonra oyuncu yeni puaniyla oyuna devam edecek. 
		(Oyun icinde birden fazla defa bonus ekleme fonksiyonu kullanilabilir)
		Bonus kurali : 
		- ilk 10 level icin mevcut puan 1000’den az ise 50, 1000 veya cok ise 100 bonus
		- 11-50 level arasi mevcut puanin yuzde 10’u kadar bonus
		- 51.levelden itibaren puan 10.000’den az ise 1000 bonus, 10.000 den coksa mevcut puanin %15 
		kadar bonus
*//*
		bonus eklenecek
		 oyuncuya yeni puan eklenecek
		 
		if>> 1-10 level  mevcut puan 1000  az ise  50
									 1000 çok ise 100 bonus
									 
		11-50	mevut puanın +%10 kadar bonus eklencek
		51 den sonra  10000 az ise 1000 bonus		
								   10000 çok ise mevcut puanın +%15 bonus
	*/
		Scanner scan=new Scanner(System.in);
		int level=scan.nextInt();
		bonus();
		level();
		
		
	}

}
