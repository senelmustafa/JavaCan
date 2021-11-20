package Day02_Scanner;

public class C03_SwapVeriables {

	public static void main(String[] args) {
		// 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
        int sayi1=15;
        int sayi2=20;
        
        // baslangicta sayi1=10 ve sayi2=20
        
        
        	System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        
        sayi1=sayi1-sayi2;
        sayi2=sayi1+sayi2;
        sayi1=sayi2-sayi1;
        	System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
	}

}
