package Day05_MatematikselIslemler;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class C03_Modulus {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("üc basamaklı bie sayı giriniz");
		
		int sayi=scan.nextInt();
		int rakamlarToplami=0;
		int rakam=sayi%10;//bana birler basama��� verir 3
		rakamlarToplami+=rakam ;
		sayi/=10;
		System.out.println(sayi);//art�k 57 oldu.
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		
		System.out.println(sayi);
		
		sayi/=10;
		System.out.println(sayi);
		
		rakamlarToplami+=sayi;
		System.out.println("rakamlarToplami toplam�="+rakamlarToplami);
			scan.close();	
	}

}
