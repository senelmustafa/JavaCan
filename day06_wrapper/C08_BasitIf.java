package day06_wrapper;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

public class C08_BasitIf {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("bir kenarı girin  =");
		 
		 double kenar1=scan.nextDouble();
		 System.out.print("diğer kenarı giriniz  ");
		 double kenar2=scan.nextDouble();
		 
		 if (kenar1==kenar2) {
			System.out.println("girilen değerler karedir.");
		}

		 if (kenar1!=kenar2) {
			 System.out.println("bu bir kare değil dikdortgendir.");
		}
	}

}
