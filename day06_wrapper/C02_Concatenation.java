package day06_wrapper;

public class C02_Concatenation {

	public static void main(String[] args) {

		String str1="Java";
		String str2="güzel";
		int sayi1=5;
		int sayi2=4;
		
		System.out.println(str1+" "+str2+" "+sayi1+sayi2);
		System.out.println(str1 +" "+sayi1+" "+str2);
		System.out.println(str1+" "+(sayi1+sayi2)+sayi2);
		System.out.println(str1 +" "+(sayi1-sayi2)+(sayi1+sayi2));
		System.out.println(""+sayi1+sayi2+" "+str2);

	}

}
