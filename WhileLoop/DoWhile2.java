package WhileLoop;

public class DoWhile2 {

	public static void main(String[] args) {
//Soru 2 ) âmâ harfinden baslayarak âcâ harfine kadar tum harfleri yazdirin.

		for (char i = 'm'; i > 'c'; i--) {
			System.out.print(i + " ");

		} // ----------------while loop------------
		System.out.println(" ");
		char krk = 'm';

		while (krk > 'c') {
			System.out.print(krk + " ");
			krk--;
		}

		// -------------Do While loop-------------------
		System.out.println(" ");
		char harf = 'm';
		do {
			System.out.print(harf + " ");
			harf--;
		} while (harf > 'c');

	}

}
