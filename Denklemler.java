package Java_Ornekler;

import java.util.Scanner;

public class Denklemler {

	public static void main(String[] args) {
		// birinci dereceden denklem çözümü
		
		Scanner scan=new Scanner(System.in);
		float a,b,c,x;
		System.out.println("ax+b=c deneklemine göre işlemleri yapınız");
		System.out.println("a yı giriniz");
		a=scan.nextFloat();
		
		System.out.println("b yı giriniz");
		b=scan.nextFloat();
		
		System.out.println("c yı giriniz");
		c=scan.nextFloat();
		
		x=(c-b)/a;
		
		System.out.printf("Denklemin Kökleri %.3f ",a,b,c,x );
		
	}

}
