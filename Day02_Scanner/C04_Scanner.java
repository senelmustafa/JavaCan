package Day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		//kullanýcýdan deðer almak için 3 adým takip edilir
		//1. adým scanner objesi oluþturmak
		
		
		Scanner scan=new Scanner(System.in);
		
		//2. adým kullanýcýya ne istediðini söylemek
		System.out.println("Lütfen Ýsminizi Yazýnýz :");
		
		 String isim=scan.next();
		 System.out.println("isminiz : "+isim);
	
	//scan bir tarama objesidir
		 //isim olarak farklý bir isim yazsak da çalýþýr  ama scan demeyi tercih etmek lazým
		 //scan bir obje olduðu için dat trü non-primitive dir
		 //primitive data türleri sadece deðer içerirken 
		 //->> non primitive data türkeri deðerrin yanýnda method lar barindirir
		 //scan. dediðimizde bu methodlarý kullanabiliriz.
		 
		 scan.close();
	}

}
