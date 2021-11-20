package FORLOOK;

import java.util.Scanner;

public class C09ForLook_Palindrome {

	public static void main(String[] args) {
//		Kullanicidan bir String isteyin. Kullanicinin girdigi String’in 
//		palindrome olup olmadigini kontrol eden bir program yazin.
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdırmak için bir yazı  giriniz...");
		String str = scan.nextLine();

		if (str.equals(tersineCevir(str))) {
				System.out.println("girdiniz strin palindrome");
		} else {
			System.out.println("girdiniz strin palindrom değil");
		}
		System.out.print(tersineCevir(str));
				scan.close();
	}

	public static String tersineCevir(String str) {
		
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.substring(i,i+1);
		}
		return tersStr;
		 
		
	}

 
	}

 
