package Arrays;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 7, 80, 90 };

		//tüm elementleri yazdırabiliriz
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+"  ");
			
		}
		 System.out.println("");
		 System.out.println(Arrays.toString(arr));
	}

}
