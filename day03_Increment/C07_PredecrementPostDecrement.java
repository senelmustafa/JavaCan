package day03_Increment;

public class C07_PredecrementPostDecrement {

	public static void main(String[] args) {
		 
		int sayi=10;
		
		sayi--;
		
		System.out.println(sayi);
		
		int a=sayi--;
		System.out.println(a);//9
		System.out.println(sayi);//8
		System.out.println(--a);//8
	}

}
