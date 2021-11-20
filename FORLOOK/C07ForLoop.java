package FORLOOK;

import java.util.Scanner;

public class C07ForLoop {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdırmak için bir yazı  giriniz...");
		String str = scan.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.substring(i, i + 1));
scan.close();
		}

	}

}

//cekoslavakyalilastiramadiklarimizdanmisiniz