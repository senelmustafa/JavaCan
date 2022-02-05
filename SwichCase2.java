package Java_Ornekler;

import java.util.Scanner;

public class SwichCase2 {
//kullanıcıdan hangi rakama basıldığını bulma 

	public static void main(String[] args) {

		System.out.println("Bir rakam giriniz :");
		rakamGir();
	}

	private static void rakamGir() {
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("1 girildi");
			break;

		case 2:
			System.out.println("2 girildi");
			break;
		case 3:
			System.out.println("3 girildi");
			break;
		case 4:
			System.out.println("4 girildi");
			break;
		case 5:
			System.out.println("5 girildi");
			break;
		case 6:
			System.out.println("6 girildi");
			break;
		case 7:
			System.out.println("7 girildi");
			break;
		case 8:
			System.out.println("8 girildi");
			break;
		case 9:
			System.out.println("9 girildi");
			break;

		default:
			System.out.println("yanlış bir değer girdiniz...");
			break;
		}

	}

}
