package day03_Increment;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		int sayi1=300;
		
		short sayi2= (short) sayi1 ;
		//hatayý gidermek için büyük data türündeki deðerin önüne onayýmýzý alarak (short) yazýlýr
		System.out.println(sayi2);
		
		byte sayi3= (byte) sayi2;
		System.out.println(sayi3);
//deðer byte sýnýrlarýndan bütük olduðu için java 300 ü kendi yöntemine göre byte dönüþtürür.
		double sayi4=87.3;
		int sayi5= (int) sayi4;
		
		System.out.println(sayi5);
		
		//deðer , olduðundan int 'da ondalýklý olmadýðýndan java onadalýklý kýsmý keser.
		//bundan dolayý data kaybý oluþur.
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6/sayi7);
		//bölme iþlemi yapýlan iþlemin ikiside int olduðu için sonucuda int kabul eder.

		double sayi8=4;
		double sayi9=17;
		System.out.println(sayi8/sayi9);//6,75 iþlem yapýlan sayýlardan daha genl turune sahip oldupundan double olur sonuçta
	
		
		
	}

}
