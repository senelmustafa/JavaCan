package day03_Increment;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println( "yarıçap gir =");
		 	double yaricap=scan.nextDouble();
		 	
		 	double cevre=2*3.14*yaricap;
		 	double alan=3.14*yaricap*yaricap;
		 	
		
		System.out.println("çevre =" + cevre);
		System.out.println("alan =" + alan);
scan.close();
	
	}

}
