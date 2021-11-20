package WhileLoop;

import java.util.Scanner;

public class Whilie_Forla {

	public static void main(String[] args) {
		// for Loop ile yapımı

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz :");
		int sayi = scan.nextInt();
//for(int i=sayi;i>0;i/=10) 
		int rakamlarToplami = 0;
		int rakam = 0;

		rakamlarToplami = 0;
		String sayiStr = "" + sayi;//"" yazarak sayiyi stringe çevirmiş olurum
//in tolarak verilen bir sayıyının basamak sayılarını bulmakk istersek 
		//kısa yoldan o sayıyı stringe çevirip ,str.lenght()
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;
scan.close();
		}

		System.out.println(rakamlarToplami);

	}

}
