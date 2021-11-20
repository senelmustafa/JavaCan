package WhileLoop;

import java.util.Scanner;

public class while_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane 
		olduklarini ekranda yazdirin*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bölenlerini bulmak için pozitif bir tam sayı giriniz :");
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen+" ");
				sayac++;
				
			}
			bolen++;
		}
		System.out.println(sayi+" \nsayisinin "+ sayac+"adet tam boleni var");
		scan.close();
	}

}
