package Java_Ornekler;

import java.util.Scanner;

public class Tersten {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
//	yazılan yazıyı tersten yazdır
	
	StringBuilder s1=new StringBuilder(scan.nextLine());
	
	s1.reverse();
	
	System.out.println(s1);
	 
 
	}
}