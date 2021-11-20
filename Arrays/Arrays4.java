package Arrays;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
	//	Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
	int arr[]= {1,2,3,4,5,6};
	int toplam=0;
	
	for (int i = 0; i < arr.length; i++) {
		toplam+=arr[i];
	}
	System.out.println("elmentlerin toplamı"+toplam);
	//arrayin tüm elemanlarını küçükte büyüe 
	//sonra nüyükten küçüğe yazdırn
	
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	//büyükten küçüğe
	
	for (int i =arr.length-1; i >=0 ; i--) {
		System.out.print(arr[i]+" ");
		
	}
	//array yapmak isterseniz aynı uzunlukta bir array oluşturup 
	//elemanları ters sırada yeni arraya çalıştırablirisiniz
	
	int tersArray[]=new int[arr.length];
	System.out.println(Arrays.toString(tersArray));
	for (int i = 0; i < tersArray.length; i++) {
		tersArray[i]=arr[arr.length-1-i];
	}
	System.out.println(Arrays.toString(tersArray));
	}

}
