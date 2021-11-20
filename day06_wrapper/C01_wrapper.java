package day06_wrapper;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class C01_wrapper {

	public static void main(String[] args) {
		
		int sayi=10;
		Integer sayi2=20;

		String tel1 ="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		//String caddeNoString="B208";// B olduğunda string bir ifade olarak kabul eder
		String caddeNoString="2589";
		String sokokNoString="1564";
		System.out.println(Integer.valueOf(caddeNoString)+Integer.valueOf(sokokNoString));
		 //Integer.valueOf(String numarik ifade )metodu string olarak kaydedilmiş numarik ifadeleri sayıya çevirir
		//ancak string ifade numerik olmayan bir karakter olurssa  NumberFormatException hatası verir
		//stop execution



	}

}
