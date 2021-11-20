package MethodOlusturma;

public class C03Method_Overloaading {

	public static void main(String[] args) {
		//java da aynı isimde birden fazla isimde method olur mu?EVET
		//Aynı isimde birden fazla method olursa JAVA hangisini çalıştıracağına 
		//nasıl karar verir?
		
//		int sayi1=4;
//		int sayi2=5;
//		int sayi3=10;
//		int sayi4=20;
//		topla(sayi1,sayi2,sayi3,sayi4);
		topla(2.9, 4);
	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("üç sayının toplamı"+(sayi1+sayi2+sayi3+sayi4));
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("üç sayının toplamı"+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, Double sayi2) {
		 
		System.out.println("iki sayının tolamı :"+(sayi1+sayi2));
	}
	private static void topla(int sayi1, int sayi2) {
		 
		System.out.println("iki sayının tolamı :"+(sayi1+sayi2));
	}
	private static void topla(Double sayi1, int sayi2) {
		 
		System.out.println("iki sayının tolamı :"+(sayi1+sayi2));
	}
	private static void topla(Double sayi1, Double sayi2) {
		 
		System.out.println("iki sayının tolamı :"+(sayi1+sayi2));
	}
}
