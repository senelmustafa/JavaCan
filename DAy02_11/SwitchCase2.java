package DAy02_11;

import day03_Increment.c05_IncrementDecrement;

public class SwitchCase2 {

	public static void main(String[] args) {
		// Harf olarak girilen notu rakama çevirin

		char not = 'A';
		switch (not) {
		case 'A':
			System.out.println("85-100");
			break;
		case 'B':
			System.out.println("60-85");
			break;
		case 'C':
			System.out.println("50-60");
			break;

		case 'D':
			System.out.println("50'den büyük");
			break;
		default:
			System.out.println("geçersiz not");

		}

	}

}
