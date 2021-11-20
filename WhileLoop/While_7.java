package WhileLoop;

import java.util.Scanner;

public class While_7 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz :");
		int sayi = scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
		
		while (sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
		}
		
		System.out.println(rakamlarToplami);
		
		scan.close();
		
	}

}
