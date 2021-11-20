package Day08_Else;

import java.io.Closeable;
import java.util.Scanner;

public class C08_Nested_ElseIf {

	public static void main(String[] args) {
		System.out.println("yaşınızı giriniz");
		Scanner scan= new Scanner(System.in);
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		 System.out.println("yaş gir");
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
			
			if (yas>=65) {
				System.out.println("emekli olabilirsin");
				
			} else {
				System.out.println("emekli olamazsın");
			}
			
		} else if(cinsiyet=='K'){
			if (yas>=60) {
				System.out.println("emekli olabilirsin");
			} else {
				System.out.println("emekli olamazsın");
			}

		}else {
			System.out.println("geçerli bir harf giriniz");
		
			
			
			
			scan.close();
		}
		
		

	}

}
