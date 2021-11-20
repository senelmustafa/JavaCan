package Day08_Else;

import java.util.Scanner;

public class c06_Ortalama {

	public static void main(String[] args) {
//		Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin. 
//		50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A” 

		
			System.out.print("1 ila 100 arasında notunuzu giriniz =");
			Scanner scan=new Scanner(System.in);
			
			double not=scan.nextDouble();
			if (not <0 || not>100) {
				System.out.println("geçerli bir not yazınız");
			} else if (not<=49) {
				System.out.println("D");
			} else if(not>=50 && not<=59){
				System.out.println("C");
			}else  if(not>=60 && not<=79){
					System.out.println("B");
			}else  if(not>=80 ){
				System.out.println("A");
				scan.close();
				}
			}
	}

