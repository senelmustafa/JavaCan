package Java_Ornekler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class topbala {

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		//Tombala yapıyoruz.
		/*
		 beş tane sayı istiyoruz.bu sayıların random olarak beş tane sayı ürüteceğiz
		 kullanıcıdan girilen sayıların-> ramdom sayılarla eşit olup olmadığını karşılaştıracağız
		 kaç tanesi eşit olduğunu bulacağız..
		 */
		System.out.println("Lütfen bir sayı giriniz\t:");
		Scanner scan=new Scanner(System.in);
		int sayiGir1=scan.nextInt();
		
		
		ArrayList sayi=new ArrayList();
		sayi.add(sayiGir1);
		
		int sayiGir2=scan.nextInt();
		sayi.add(sayiGir2);
		
		int sayiGir3=scan.nextInt();
		sayi.add(sayiGir3);
		
		int sayiGir4=scan.nextInt();
		sayi.add(sayiGir4);
		
		int sayiGir5=scan.nextInt();
		sayi.add(sayiGir5);
		//Collections.sort(sayi);

		System.out.println(sayi);
		
		int dizi[]=new int[5];
		Random s=new Random();
		int toplam=5;
		for (int i = 0; i < 5; i++) {
			dizi[i]=s.nextInt(100);
			toplam+=dizi[i];
			
			System.out.print(dizi[i]+",");
		
			 
				
			}
	}	
	}
 
 
