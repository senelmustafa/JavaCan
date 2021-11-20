package day03_Increment;

public class C06_PreIncrementPostIncrment {

	public static void main(String[] args) {
		//PreIncrementPostIncrment sayi++ sayi-- için geçerlidir
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi);

		
		System.out.println(sayi++);//13
		System.out.println(sayi);//16.satýrda sayýyý yazdýrdýktan sonra 13 ü 14 yaptýrdýðý için
		//bizim sayýmýzý 14 yaptý.
		
		
		System.out.println(++sayi);
	}

}
