package Arrays;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
	/*	Soru 1: Verilen 3 elemanli bir array’in 
	 * tum elemanlarini bir soldaki konuma 
	 * tasiyacak bir program yazin. 
	 * Ornek; array [1,2, 3] ise 
	 * output [2, 3, 1] olacak.
	 */
		int arr[]= {2,4,6};
		int gonder= arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]= arr[i+1];
			
		}
		arr[arr.length-1]=gonder;
		System.out.println(Arrays.toString(arr));
		
	}

}
