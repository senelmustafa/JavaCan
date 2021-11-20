package FORLOOK;

import java.util.Scanner;

public class C11ForLoop {

	public static void main(String[] args) {
//		Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen 
//		sayinin faktoryel’ini bulun. (5!=5*4*3*2*1
		Scanner scan = new Scanner(System.in);
		System.out.println("faktoriyel hesaplama için bir sayı giriniz");
		int sayi1=scan.nextInt();
		
		
		System.out.print(sayi1+"!=");
		int faktoriyel=1;
		for (int i =sayi1; i >1; i--) {
			faktoriyel*=i;
			System.out.print(i+"*");
		}
			System.out.println("1="+faktoriyel);
		
		scan.close();
	
	
	}

}
