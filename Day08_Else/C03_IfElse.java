package Day08_Else;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
//		Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, 
//		calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdiri
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yaşınız");
		int yas=scan.nextInt();
		
		if (yas<=65) {
			System.out.println("emekli olamazsın");
			
		} else {
			System.out.println();
		}
				scan.close();
	}

}
