package WhileLoop;

import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		/*
		 * kullanıcıdan toplanmak üzere sayı isteyin kullanıcı 0 a basıncaya kadar
		 * sayılaarı alıp toplamaya devam edin o ana kadar kaç sayı girdini ve girilen
		 * sayıların toplamını yazdırınız
		 */
		Scanner scan = new Scanner(System.in);

		int sayi = 1;//0 dışında n e yazarsanız yazın
		int toplam = 1;
		int sayac = 1;

		while (sayi != 0) {
			System.out.println("toplama eklemek için bir tamasayı giriniz =\n bitirme için 0 basın");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

		}
		// kullanıcı 0 bastığında loop işlevini son kez yapıp sonra başa dönecek sonra
		// loop bitecek
		System.out.println("girilen sayı adedi"+" "+ (sayac-1));
		System.out.println("girilen sayı toplamı "
				+ " "+ toplam);
	scan.close();
	}

}
