package Day11;

import java.util.Scanner;

public class C05_IndexOf {

	public static void main(String[] args) {
		 
//		Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup 
//		olmadigini yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);
		if(index<0) {
			System.out.println("gürdüğünüz cümlede karakter yok");
		}else {
			System.out.println("harf cümlede var");
		}
				
	}

}
