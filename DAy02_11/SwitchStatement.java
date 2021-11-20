package DAy02_11;

public class SwitchStatement {

	public static void main(String[] args) {
		
//gün numarasına göre isimleri yazalım 
		int gunNo=10;
		
		
		switch(gunNo) {
		case 1:
				System.out.println("Pazartesi");
				break;
		case 2:
				System.out.println("Salı");
				break;
		case 3:
				System.out.println("Çarşamba");
				break;
		case 4:
				System.out.println("Perşembe");
				break;
		case 5: 
				System.out.println("Cuma");
				break ;
				
		case 6:	
				System.out.println("Cumartesi");
				break;
		default:
					System.out.println("Lütfen Geçerli Bir Gün Numarası Yazınız");
		}
	}

}
