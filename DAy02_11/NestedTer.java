package DAy02_11;

import java.util.Scanner;

public class NestedTer {

	public static void main(String[] args) {
		 
//		Verilen değerleri inceleyin
//		kucuk harf ise consola “Kucuk Harf” ,
//		buyuk harfse consola “Buyuk Harf” 
//		yoksa “girdiginiz karakter harf degil” yazdirin

		char krk='F';
		//(veri>='a'&& veri<='z' || veri>='A'&& veri<='Z')
		//String sonuc=(krk>='a' && krk<='z')? "küçük harf" :  (//şart ise sonuç)
		String sonuc=(krk>='a' && krk<='z') ? "küçük harf" :  
					 (krk>='A'  && krk<='Z') ? "büyük harf " : "girilen karakter değil"  ;
		System.out.println(sonuc);
		
	}

}
