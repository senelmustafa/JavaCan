package Day05_MatematikselIslemler;

public class C02_MatematikselIslemler {

	public static void main(String[] args) {
		
		
		int sayi1=10;
		int sayi2=20;
		String str1="ALİ";
		String str2="CAn";
		
			System.out.println(sayi1+sayi2+str1);//30 AL�
			
			
			System.out.println(str1+sayi1+sayi2);//AL�1020  string oldu�u i�in yan yana yazar.
			
			System.out.println(str1+(sayi1+sayi2));
			
			System.out.println(sayi1*sayi2+str1);
			System.out.println(str1+sayi1*sayi2);
			System.out.println(str2+(sayi1*sayi2));
			
			/*
			 * 30AL�
AL�1020
AL�30
200AL�
AL�200
AL�200
			 */
			
	}

}
