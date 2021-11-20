package Day11;

import java.util.Scanner;

public class c07_Contains {

	public static void main(String[] args) {
		 
		
		//girilen değer içersinde "kelimenin" var olup olmadığını sorguluyor.
       System.out.println("bir cümle giriniz");
		Scanner scan=new Scanner(System.in);
     	String x=scan.nextLine();
		System.out.println(x.contains("hayat"));
		
	}

}
