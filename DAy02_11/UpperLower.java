package DAy02_11;

import java.util.Locale;

public class UpperLower {

	public static void main(String[] args) {

		String isim ="APPLE";//büyük ALİ olarak yazdıralım
		System.out.println(""+isim.toUpperCase().charAt(0)+
				isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));
		
		//TR lokal harfler kull.tamamını küçük harfe çevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(isim.toLowerCase(Locale.KOREAN));
	}

}
