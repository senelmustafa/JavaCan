package Java_Ornekler;

import java.util.Scanner;

public class Asal_Sayilar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Asal Sayılar
		System.out.println("2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 ve 97");
		System.out.println("Asal Sayıları Giriniz :");
		Scanner scan=new Scanner(System.in);
		
		while(true) {
		
			int asal =scan.nextInt();
			if(asal==2 ||asal==3 ||asal==5 ||asal==7) {
				System.out.println("Asaldır..");
				
			}else if(asal%2==0 || asal%3==0 || asal%5==0 ||asal%7==0) {
				System.out.println("Girdiğiniz Sayı asal değildir");
			}else {
			System.out.println("Girdiğiniz Sayı ASALDIR...");
			}if(asal==00) {
			System.out.println("*****\t Çıkış Sağlandı\t*****");
			break;
			}
			
		}
	}

	}


