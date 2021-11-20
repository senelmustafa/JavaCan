package Day11;

import java.util.Scanner;

public class C08_Contains {

	public static void main(String[] args) {
//		Soru 1) Kullanicidan email adresini girmesini 
//isteyin,
//mail @gmail.com icermiyorsa 
//“lutfen gmail adresi giriniz”,
//@gmail.com ile bitiyorsa 
//“Email adresiniz kaydedildi “ ,
//@gmail.com ile bitmiyorsa lutfen
//yazimi kontol edin yazdirin
		
		
		System.out.println("mail adresinizi giriniz");
		Scanner scan=new Scanner(System.in);
		String email=scan.next();
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
					
	
		if (!email.contains("@gmail.com")) {
		   System.out.println("lutfen gmail adresi giriniz");
		
		} else if(index==uzunluk-10) {
			System.out.println("yazımı kontrol ediniz");

		}
			
				

	}

}
