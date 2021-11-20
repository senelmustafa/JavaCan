package Day08_Else;

import java.util.Scanner;

public class C05_Else3 {

	public static void main(String[] args) {
//		 Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
//		 birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana 
//		 “Eskenar degil” yazdirin
		System.out.println("sırasıyla üçgenin kenarları giriniz");
		Scanner scan=new Scanner(System.in);
		
//		double kenar1=scan.nextDouble();
//		double kenar2=scan.nextDouble();
//		double kenar3=scan.nextDouble();
//		
//		if (kenar1==kenar2 && kenar2=kenar3) {

		System.out.println("eşkenar üçgendir");
		
//		} else {
//			System.err.println("eşkenar üçgen değildir");
//			
		
        
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        
        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }

		}
		
	}

 
