package Java_Ornekler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci 0 1 1 2 3 5 8 13 21...
	
	Scanner scan=new Scanner(System.in);
	System.out.println("bir sayı giriniz");
	int input =scan.nextInt();
	
	int s1=0;
	int s2=1;
	int toplam;
	System.out.println(input +" Sayısının fibonacci Serisi :");
	
	for (int i = 0; i <= input; i++) {
		System.out.print(s1+", ");
		
		toplam=s1+s2;
		s1=s2;
		s2=toplam;
		
	}
	
	}
	
	}
 
