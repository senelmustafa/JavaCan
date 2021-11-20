package WhileLoop;

public class While3 {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
				System.out.println(i);
			}
		}
		int sayi=100;//başlangıç deerim
		
		while (sayi<1000) {
			if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
				System.out.print(sayi+" ");
			}
	sayi++;
		}
		//başlangıç ve bitiş adedi belli ise
		//veya tekrar edilecek işlem adedi belli ise
		//FOR LOOP kullanılır.
		//işlem tekrar sayısı belli değilse bitiş sınır değerinden büyük olma gibi bir şart varsa 
		//while tercih edilir.
	}

	
	
	
}
