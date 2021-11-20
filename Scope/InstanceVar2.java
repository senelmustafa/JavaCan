package Scope;

public class InstanceVar2 {
String adres="Ankara";
String dogunYeri;
double ortOrtalamasi;
double yasOrt=12.3;
char cinsiyet='E';
char karakter;
boolean ogrenciMi=true;
boolean izinliMi;


	
	
	public static void main(String[] args) {
//instance variblelere direk oluşturulamaz
		//ancak obje oluşturarak
		//class ismi oluşturara yapılr
		InstanceVar2 ali=new InstanceVar2();
		System.out.println(ali.adres);
		System.out.println(ali.dogunYeri);
		System.out.println(ali.ortOrtalamasi);
		System.out.println(ali.yasOrt);
		System.out.println(ali.cinsiyet);
		System.out.println(ali.karakter);//space
		System.out.println(ali.ogrenciMi);
		System.out.println(ali.izinliMi);

	}
public static void staticMethod() {
	
	
}
}
