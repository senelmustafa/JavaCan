package Scope;

public class StaticVariables {

	static int no = 20;
	static int sayi;
	static String adres = "Ankara";
	static String cadde;
	static boolean aktifMi = true;
	static boolean tatildeMi;

	public static void main(String[] args) {
		// static variblelere methoddan direk ulaşılır
		System.out.println(no);
		no++;
		System.out.println(no);
		staticMethod();
		StaticVariables obje=new StaticVariables();
		obje.staticOlmayanMethod();
	}

	public static void staticMethod() {
		no++;
		System.out.println(no);
	}
public void staticOlmayanMethod() {
	//static olsun olmasın methodalara heryenden ulaşabilir
	//class varible denir.
	no++;
	System.out.println(no);
	
}
}
