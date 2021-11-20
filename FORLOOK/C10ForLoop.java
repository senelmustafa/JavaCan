package FORLOOK;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

public class C10ForLoop {

	public static void main(String[] args) {
//		Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari 
//		toplayip, sonucu yazdiran bir program yaziniz
 
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Sayi");
		int sayi1=scan.nextInt();
		System.out.println("2.Sayi");
		int sayi2=scan.nextInt();
		int toplam=0;
		
		int kucuk=0;
		int buyuk=0;
		if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
		} else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
		for (int i =kucuk ; i <=buyuk ; i++) {
			toplam+=i;
		}
		System.out.println("girilen sayılar ve aralarındaki sayıların toplamı ="+toplam);	
		
		scan.close();
		
	}

}
