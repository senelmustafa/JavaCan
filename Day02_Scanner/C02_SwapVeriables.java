package Day02_Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C02_SwapVeriables {

	public static void main(String[] args) {
		/* 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10
		 	*/
		int sayi1=10;
		int sayi2=20;
		
		System.out.println("baþlangýçta sayý 1="+ sayi1+"ve sayi2="+sayi2);
		
		int bos;
		
		bos=sayi2;
		sayi2=sayi1;
		sayi1=bos;
		System.out.println( "sonuçta sayi 1:"+sayi1+"ve sayi 2: "+sayi2);
	}

}
