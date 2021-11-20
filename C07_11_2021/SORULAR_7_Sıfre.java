package C07_11_2021;

import java.util.Scanner;

public class SORULAR_7_Sıfre {

	public static void main(String[] args) {
//		Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
//    isim-soyisim : M***** B*******
//    kart no : **** **** **** 1234

		Scanner scan = new Scanner(System.in);
		String isim = scan.next();
		String sIsim = scan.next();
		String kkart = scan.next();

		System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*") + " "
				+ sIsim.substring(0, 1).toUpperCase() + sIsim.substring(1).replaceAll("\\w", "*"));
		System.out.println(
				kkart.substring(0, 4).replaceAll("\\w", "*") + " " + kkart.substring(4, 8).replaceAll("\\w", "*") + " "
						+ kkart.substring(8, 12).replaceAll("\\w", "*") + " " + kkart.substring(12, 16));
	scan.close();
	}

}
