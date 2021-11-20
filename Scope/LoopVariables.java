package Scope;

public class LoopVariables {

	public static void main(String[] args) {
		int sayi=10;
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi+" "+isim);
		}
		//System.out.println(sayi);
		//Loop içersinde oluşturulan varibleler loop dışında kullanamazlar
		//bunun için loop dışında ihtiyacımız olan bir değişken varsa
		//loop dan once oluşturulur. ve emniyette kalmak için
		//initialize yaparız.
		for (int i = 0; i < 10; i++) {
			//int sayi=20;
			/*sayı varible i imain  methodun içersinde llşuturulduundan tümm main methodda geçerlidir dolayısıyla
			 * aynı isimde bir varible oluşturamazsnız
			 * */
			
		}
	}

}
