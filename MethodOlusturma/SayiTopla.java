package MethodOlusturma;

import java.util.Scanner;

public class SayiTopla {

	public static void main(String[] args) {
//	Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
//		Kullanici 2,3 veya 4 degerini girerse,
//kullanicidan bu sayilari girmesini isteyin 
//ve sayilarin toplamini yazdirin. 
//Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
//“Cok sayi girdiniz, ben toplayamam” yazdirin.

System.out.println("kaç sayı toplamak istersiniz 2-3-4 den biriniz seçiniz");
Scanner scan=new Scanner(System.in);
int tercih=scan.nextInt();


if(tercih>4) {
	tercih=5;
}
switch (tercih) {
case 2:
	ikisayiTopla();
	break;
	
case 3:
	ucsayiTopla();
	break;
case 4:
	dortsayiTopla();
	break;
case 5:
	System.out.println("çok sayı girdiniz,ben toplayamam");
	
default:
	System.out.println("geçersiz tercih");
	break;

 
}






	}

	private static void dortsayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayı giriniz \n her sayıdan sonra ENTER basın");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		System.out.println(sayi1+sayi2+sayi3+sayi4);
		
	}

	private static void ucsayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayı giriniz \n her sayıdan sonra ENTER basın");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3=scan.nextDouble();
		System.out.println(sayi1+sayi2+sayi3);
		
		
	}

	private static void ikisayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayı giriniz\n her sayıdan sonra ENTER basın");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println(sayi1+sayi2);
		
	scan.close();
		}

}
