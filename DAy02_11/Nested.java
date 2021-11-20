package DAy02_11;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
//		Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, 
//		calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdirin

		//her seferinde scanner oluşturmak yerine 
		//test datalarımızı veriable olarakta oluşturabiliriz.
		//ve kod yazı bittiğinde bu test datalarını değiştirere
		//kodlarımızı test edebiliriz.
		
		char cinsiyet='E';
		int yas=60;
		
		String sonuc = cinsiyet=='K' ?(yas>=60 ? "Emekli olablirsiniz" :"olamazsın"):
			            			  (yas>=65 ? "Emekli olablirsiniz" :"olamazsın");
System.out.println(sonuc);
	}

}
