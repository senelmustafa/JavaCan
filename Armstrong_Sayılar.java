package Java_Ornekler;

public class Armstrong_Sayılar {

	public static void main(String[] args) {
		// Armstrong Sayılar
		int birler,onlar,yuzler,toplam,toplam1;
		
		for (int i =100; i <=999; i++) {
			
			toplam=i;
			
			birler= (toplam % 10);
			 toplam/=10;
			
			onlar=(toplam%10);
			toplam/=10;
		 
			
			yuzler=(toplam%10);
			toplam/=10;
			
			toplam1=((birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler));
			if(toplam1==i) {
				System.out.println(i+" Armstrong Sayıdır");
				
			}
		}

	}

}
