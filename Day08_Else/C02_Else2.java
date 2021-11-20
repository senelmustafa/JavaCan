package Day08_Else;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C02_Else2 {

	public static void main(String[] args) {
//		Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup 
//		olmadigini yazdirin

		System.out.print("bir karakter giriniz ");
		Scanner scan=new Scanner(System.in);
		
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
			//karakter A ve A 
			System.out.println("girdiğiniz  :"+karakter+" bir harftir");
		} else {
			System.out.println("girdiğiniz  :"+karakter+" bir harf değildir");
			scan.close();
		}
	}

}
