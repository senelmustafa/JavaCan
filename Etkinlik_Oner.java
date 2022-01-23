package Java_Ornekler;

import java.util.Scanner;

public class Etkinlik_Oner {
	public static void main(String[] args) {
		
		System.out.println("Hava Sıcaklığını Giriniz \t:");
		Scanner scan = new Scanner(System.in);
		int hava=scan.nextInt();
		
		if(hava<=4) {
			System.out.println("Hava Kayak Yapmaya Çok Müsayit");
		}else if(hava<=5 || hava<=30) {
			System.out.println("Sinama İzlemeye Ne Dersin?");
				
			}else if(hava>=30) {
				System.out.println("Bu Havada Yüzmeye Gidip Serinlemelisin.");
		}else {
			
			System.out.println("Sen Ne Yapmak İstersen Artıkk :D");
		}
	}

}
