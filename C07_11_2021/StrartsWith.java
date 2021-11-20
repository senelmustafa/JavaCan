package C07_11_2021;

import java.util.Scanner;

public class StrartsWith {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("bir kelimi giriniz");
		String kelime=scan.next();

		if (cumle.startsWith(kelime)) {//başlama ile ilgili
		System.out.println("girilen cümle"+ kelime+"başlıyor");
				
		}else {
			System.out.println("girilen cümle "+ kelime +"  ile başlamıyor");
		}
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cümle  "+ kelime +"  bitiyor");
			
			}else {
				System.out.println("girilen cümle  "+ kelime +"  ile bitmiyor");
		scan.close();
	}
	}
}

