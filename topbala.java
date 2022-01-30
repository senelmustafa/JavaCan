package Java_Ornekler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class topbala {

	
	public static void main(String[] args) {
		//Tombala yapıyoruz.
		/*
		 beş tane sayı istiyoruz.bu sayıların random olarak beş tane sayı ürüteceğiz
		 kullanıcıdan girilen sayıların-> ramdom sayılarla eşit olup olmadığını karşılaştıracağız
		 kaç tanesi eşit olduğunu bulacağız..
		 */
		System.out.println("Lütfen bir sayı giriniz\t:");
		Scanner scan=new Scanner(System.in);
		int dizi0[]=new int[8];
		
		int toplam1=0;
		
		
		for (int i = 0; i < dizi0.length; i++) {
			dizi0[i] =scan.nextInt();
			//toplam1+=dizi0[i];
			
		}//System.out.print(Arrays.toString(dizi0));
		
		
		
		
	
		int dizi[]=new int[8];
		Random s=new Random();
		int toplam=5;
		for (int i = 0; i < 8; i++) {
			dizi[i]=s.nextInt(100);
			toplam=dizi[i];
			
			
				
			}System.out.print("▬▬▬▬TOMBALA SONUÇLARI▬▬▬▬ \n") ;
			System.out.println(Arrays.toString(dizi0));
			System.out.println(Arrays.toString(dizi));
	}	
	}
 
 
//DEĞİŞİKLİK YAPILMIŞTIR
