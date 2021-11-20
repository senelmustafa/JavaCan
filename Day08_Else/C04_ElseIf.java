package Day08_Else;

import java.util.Scanner;

public class C04_ElseIf {

	public static void main(String[] args) {
//		Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
//		sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli 
//		isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
//		sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
// 
		System.out.println("iki sayı giriniz ENTER basınız =");
		Scanner scan=new Scanner(System.in);
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("toplam "+(sayi1+sayi2));
			
		} else if(sayi1<0 && sayi2<0){
			System.out.println("çarpım "+(sayi1*sayi2));
			
		}else if(sayi1*sayi2<0 ){
			System.out.println(	"farkli isaretlerde sayilarla islem yapamazsin ");
		
		scan.close();
		}
	}
}


 
