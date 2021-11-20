package day06_wrapper;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class C06_BasitIf {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Lütfen bir tam sayı giriniz  =");
		 int sayi=scan.nextInt();
		 
		 if (sayi%2==0) {
			 System.out.println("girdiğiniz sayı çifttir.");
			
		}
				
		 if (sayi%2==1) {
			System.out.println("girdiğiniz sayı tek bir sayıdır.");
		}
	}

}
