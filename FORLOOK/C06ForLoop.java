package FORLOOK;

import java.util.Scanner;

public class C06ForLoop {

	public static void main(String[] args) {
//		Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak 
//		girilen sayiya kadar tum sayilari yazdirin. Ancak;
//		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
//		- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
//		- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin	// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
        int num =scan.nextInt();
        
        for (int i = 1; i <=num ; i++) {
        	
			if (i%3==0 && i%5==0) {
				System.out.println("Java Güzeldir.");
			} else if (i%3==0) {
				System.out.println("JaVA");
			} else if (i%5==0) {
				System.out.println("Güzeldir");
			} else {
				System.out.println(i);
				scan.close();
			} 
		}
        
        
	}

}
