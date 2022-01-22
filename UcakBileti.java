import java.util.Scanner;

public class UcakBileti {
	/*
	 * km birim fiyartı :0.10$ 12 yaşında küçükse toplam fiyata 50% indirim 12-24
	 * yaş aralığındaysa %10 indirim 65 yaşından büyükse %30 indirim gidiş -dönüş
	 * alırsa %20 indirim bu koşullara uygun uçak bileti fiyatı hesaplayan program
	 */
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int yas,km,tip;
	System.out.println("Lütfen yaşınızı giriniz");
	yas=scan.nextInt();
	System.out.println("Km giriniz");
	km=scan.nextInt();
	System.out.println("Lütfen Durum Seçiniz\n 1-gidiş , 2-Gidiş-Dönüş");
	tip=scan.nextInt();
	double normalFiyat,yasIndirimi,tipIndirimi;
	
	if(km>0 && yas>0  &&  (tip==1 || tip==2) ) {
		normalFiyat=(km*0.10);
	if(yas<12) {
		yasIndirimi=(normalFiyat*0.5);
	}else if(yas>=12 && yas<=24) {
		yasIndirimi=(normalFiyat*0.10);
	}else if(yas>=65) {
		yasIndirimi=(normalFiyat*0.30);
	}else {
		yasIndirimi=0;
	}
	normalFiyat-=yasIndirimi;
	if(tip == 2) {
		tipIndirimi=(normalFiyat*0.20);
		normalFiyat=(normalFiyat-tipIndirimi)*2;
	}
	System.out.println("bilet tutarı\t"+normalFiyat+"$");
	}else {
		System.out.println("Girdiğiniz değerler eksik veya yanlış lütfen tekrar deneyiniz");
}	
}
}