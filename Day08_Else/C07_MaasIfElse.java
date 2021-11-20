package Day08_Else;

import java.util.Scanner;

public class C07_MaasIfElse {

	public static void main(String[] args) {
//		Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin. 
//		Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
//		60 – 80.000 arasinda ise “Konusabiliriz”, 
//		60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		
		System.out.println("Ne kadarlık bir Maaş İstersiniz");
		Scanner scan= new Scanner(System.in);
		int maas=scan.nextInt();
		
	 			
		if (maas>80000) {
			System.out.println("Kabul Ediyorum");
			
		} else if(maas>=60000 && maas<=80000){
			System.out.println("Konuşabiliriz");
		}else if(maas<60000) {
			System.out.println("Bu maaşı kabul edemem");
		scan.close();
		
				
					
				}
		}
	}


