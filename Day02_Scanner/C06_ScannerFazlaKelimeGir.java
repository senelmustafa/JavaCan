package Day02_Scanner;

import java.util.Scanner;

public class C06_ScannerFazlaKelimeGir {

	public static void main(String[] args) {
		/* Scanner iþleminde String için 2 method vardýr.
		  scan.next denildiðinde sadece bir kelime alýr 
		  2. kelimeyi almaz 
		  eðer kullanýcýdan daha fazla kelime gelme ihtimali varsa
		  scan.nexLine() kullanmalýyýz.
		  		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen Ýsminizi Giriniz : ");
		String isim=scan.nextLine();
		
		System.out.println("Soyisim Lütfen :");
		String soyisim=scan.nextLine();
		
		System.out.println("girilen Ýsim :"+ isim +" "+soyisim);
		
	}

}
