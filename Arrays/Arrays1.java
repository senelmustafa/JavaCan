package Arrays;

import Day11.Lenght;

public class Arrays1 {

	public static void main(String[] args) {
	//soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun bunu yapmiyor muyuz
		String arr[]=new String[4];
		arr[0]="Ali";
		arr[1]="Ayşe";
		arr[2]="Fatma";
		arr[3]="Veli";
		String arr2[]= {"Ali","Veli","Ayşe","Fatma"};
		
		arr2[0]="can";
		arr2[2]="Gül ";
		System.out.println(arr2[1]);
		System.out.println(arr2[arr.length-1]);//string  length () vardı burada sadece yazıyoruz.
		
	/*	System.out.println(arr[arr.length]); hata verir ama çalıştırdıktan sora çıkar
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at Arrays.Arrays1.main(Arrays1.java:21)*/
				

	}

}
