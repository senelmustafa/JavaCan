package Scope;

public class LocalVarible {
String okulIsmi;
	public static void main(String[] args) {
		// JAVA Local variblara default değer ataması yapmaz
		//Kodlarımızda sorun yaşamamak için oluşturduğumuz bir 
		//değer atamamızda fayda var
		
		int sayi=0;//int sayi ; dersek jaca CTE diyor
		System.out.println(sayi);
		
		//-->int sayi;  --->//bir local de aynı isimde birden fazla variabler oluşturulamaz
		@SuppressWarnings("unused")
		String isimString="Ali";
	}
@SuppressWarnings("unused")
public static void staticMethod() {
	//sayi;//bir local de oluşturulan variable method
	//olup olmamına bağlı olmaksızın farklı localde kullanılamaz
	
	String isim="veli";
	
}
}
