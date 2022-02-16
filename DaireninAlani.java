package Java_Ornekler;

import java.util.Scanner;

public class DaireninAlani {
/*
 Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
	public static void main(String[] args) {
		 System.out.println("Dairenin yarı çapını giriniz :");
		 Scanner scan =new Scanner(System.in);
		 double r=scan.nextDouble();
		 double π=3.14;
		 
		 //çevre
		 double cevre=(2*π*r);
		 //alanın
		 double alan=π*r*r;
		 
		 System.out.println("dairenin cevresi :"+cevre+" alanı: "+alan);
		 System.out.println("*************************");
		 
		 //Ödev
		 System.out.println("Yarıçap ve merkez açı ile daire alanı hesaplama\nYarıçap Giriniz :");
		 double α=scan.nextDouble();
		double formul=((π*(r*r)*α)/360);
		System.out.println(formul);
	}

}
