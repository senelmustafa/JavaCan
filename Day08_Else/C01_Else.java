package Day08_Else;

import java.util.Scanner;

public class C01_Else {

	public static void main(String[] args) {
		 //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		 Scanner scan=new Scanner(System.in);
		 System.out.print("bir kenarı girin  =");
		 
		 double kenar1=scan.nextDouble();
		 System.out.print("diğer kenarı giriniz  ");
		 double kenar2=scan.nextDouble();
		 
		 if (kenar1==kenar2) {
			System.out.println("girilen ölçüler karedir");
		} else {
			System.out.println("kare değildir");
			scan.close();
		}
	}

}
