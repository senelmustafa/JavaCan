package C07_11_2021;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Day05_MatematikselIslemler.denee;

public class Replace {

	public static void main(String[] args) {
		 //string olarak verilen 10.000 sayısınız
		//1.000 den büyük olup olmadığını yazınız
		
		String sonuc="10.000.0000";
		
		sonuc=sonuc.replace(".","");
		System.out.println(sonuc);
		
		
		if (Integer.valueOf(sonuc)>10000) {
			System.out.println("bulunan sonuc sayısı 1000 den çok");
		} else {
			System.out.println("bulunan sonuc sayısı 1000 den az");
		}
	}

}
