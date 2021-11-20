package day03_Increment;

import java.util.Scanner;

public class C02_ScannerIlkHarf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("isim yaz�n�z =");
		
		char ilkHarf=scan.next().charAt(0);
		System.out.println("ilk harfiniz:"+ilkHarf);
		scan.close();
	}

}
