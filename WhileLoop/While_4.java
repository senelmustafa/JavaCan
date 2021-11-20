package WhileLoop;

import java.util.Scanner;

public class While_4 {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayilar isteyin
		// sayi adedi 10'u gecerse veya toplam 500'u gecerse
		// "Bu kadar sayi yeter"
		// ..adet sayi girdin, toplami..."yazdirin
		
		
		System.out.println("Lütfen toplamak üzere sayı giriniz\nçıkma için 000 yazınız ");
		Scanner scan = new Scanner(System.in);
		int sayi = 1;
		int toplam = 1;
		int sayac = 0;

		while (sayac < 10 && toplam < 500 && sayi != 000) {
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
			if (sayac >= 10 || toplam > 500) {
				System.out.println("\n*****bu kadar yeterli*****\n");
			} else {

			}
		}
		System.out.println(
				"İşlem Adetiniz < " + ((sayac) - 1 + " >" + " \nToplam         " + "< " + ((toplam) - 1) + " >"));
scan.close();
	}

}
