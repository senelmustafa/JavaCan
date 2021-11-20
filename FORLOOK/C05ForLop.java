package FORLOOK;

import java.util.Scanner;

import MethodOlusturma.SayiTopla;

public class C05ForLop {

	public static void main(String[] args) {
//		Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 
//		3’un veya 5”in kati olan sayilari yazdirin.
	
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
        double num = scan.nextDouble();
         
        if (num>100 || num<0) {
			System.out.println("Gardaş sevdiğinin hatırına ne 100den  büyük ne negatif sayı girme");
		} else {
			for (int i = 1; i < num ; i++) {
				if (i%3==0 || i%5==0) {
					System.out.print(i+"-");
				} else {
scan.close();
				}
			}
		}
	}

}
