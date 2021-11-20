package MethodOlusturma;

public class C01MethodCreation {

	public static void main(String[] args) {
	//methodd oluşturmak için 3 adım takip edelim
	//1.ADIM Method Call  		toplama();
	//2.ADIM Methoda Arguman yazacak mıyız karar vermeliyiz
	
		int sayi1=44;
		int sayi2=55;
		carpma(sayi1,sayi2);
		toplama(sayi1,sayi2);//method call
		//3.ADIM ikinci ve 3. adımı yaptıktan sonra methodu oluştururuz.

		
	}

	public static void carpma(int sayi1, int sayi2) {
		 System.out.println("sayıların çarpımı "+sayi1*sayi2);
		
	}

	public static void toplama(int sayi1, int sayi2) {
		//4.ADIM erişim düzenleyici ve return type karar vermeliyiz.
		//erişim düzenleyici axcess modifier :(kimler kullnsın)
		//return type: bizdn sadece yazdırma istedği için void kalabilir
		System.out.println("sayıları toplamı "+sayi1+sayi2);
		
		
	}

}
