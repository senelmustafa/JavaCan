package day03_Increment;

public class c05_IncrementDecrement {

	public static void main(String[] args) {
		int sayi1=10;
		System.out.println(sayi1+=5);
		//bu iþlem sayi1 in deðerini 5 artýrýp sayi1 e assign ediyor
		//dolayýsýyla sayi1 in deðeri kalýcý olarak deðiþiyor
		System.out.println(sayi1);
		System.out.println(sayi1+12);//o anlýk sayi deðerini atýyor.
		System.out.println(sayi1);//dðer 15 oluyor burada
		
		sayi1++;//her ne kadar eþittir iþareti görünmesede assign vardýr.
		//dolayýsýyla dðer kalýcý olarak deðiþir.
		System.out.println(sayi1+10);
		
		
		
	}

}
