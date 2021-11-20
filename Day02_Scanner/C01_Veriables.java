package Day02_Scanner;

public class C01_Veriables {

	public static void main(String[] args) {
		
		/*
		 * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		 * 2- isim ve soyisim icin iki variable olusturun ve bunlari 	
		 * 		isminiz : Mehmet
		 * 		soyisminiz : Bulutluoz seklinde yazdirin
		 * 3- Iki farkli tamsayi data turunde 2 variable
		 * olusturun bunlarin toplamini yazdirin
		 * 4- Bir tamsayi ve bir ondalikli
		 * variable olusturun ve bunlarin toplamini yazdirin
		 * 5 � char data turunde bir variable olusturun ve yazdirin
		 * 6- Bir tamsayi, bir de char degisken olusturun
		 * ve bunlarin toplamini yazdirin.
		 *
		 */
		
		String ismim="Mehmet BulutÖz";
		System.out.println(ismim);	
		char ilkHarf='S';
		boolean anlasilMi= true;
		
		String isminiz="Ali";
		String soyismini="Tuskan";
		
		System.out.println("isminiz    : "+ isminiz);
		System.out.println("Soyisminiz : "+ soyismini);

		
		//3
		int a=10;
		short b=20;
		 	System.out.println(a+b);
		
		
		//4
		
		int sayi =25;
		char karakter='a';
			System.out.println(sayi+karakter);
			
		int topla=22;
		char astopla= 'a';
		System.out.println(topla+astopla);
	}

}
