package WhileLoop;

public class DOwhileLoop {

	public static void main(String[] args) {
		int i=0;
		while (i<5) {
			System.out.print(i+" ");
			i++;
		}
		//while loop önce kontrol eder sonra çalıştırı.
		//loop içinde artış yapılsada bir sonraki kontrole kadar kod çalışmaya  deva eder.
		//bu da bazı durumlarda hatalı sonuçlara ulaşmamıza neden olabilir.
		
		
		
		//do while loop ise işlemi yapar sonra şartı kontrol eder.
		//özellikle kullanıcıdan değer almalarda do while tercih edilir
		
		int a=0;
		do {
			System.out.println(a+" ");
			a++;
 	}while(a<5);

}
}