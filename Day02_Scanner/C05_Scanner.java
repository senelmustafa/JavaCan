package Day02_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		 
		/*Kullanýcýdan isim ve soyismini ayrý isteyip
		 girilen isme aþaðýdaki gibi yazdýrýnýz
		 Girilen isim :Mustafa ÞENEL
		 */
		
		Scanner scan=new Scanner(System.in);
		
			System.out.println("Lütfen Ýsminizi Giriniz : ");
			String isim=scan.next();
			
			System.out.println("Soyisim Lütfen :");
			String soyisim=scan.next();
			
			System.out.println("girilen Ýsim :"+ isim +" "+soyisim);
		
	}

}
