package day06_wrapper;

public class C03_Conditional {

	public static void main(String[] args) {
	
		System.out.println(5+3==8 | 6+5==10 | 7-2==3);
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);
		
		int a=10;
		int b=20;
		int c=30;
		boolean sonuc=a>b ||b>c || a+b>=c;
		System.out.println(sonuc);		
		
		//&& mükemmelliyetçi olduğundan hepsinin true  olması gerek.Karşılaştığı ilk false dan sonrasına bakmaz.
		//&	bu da aynı sonucu verir fakar geç cevap verir makinayı yorar..
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);
		System.out.println(5+3==8 & 6+5==10 & 7-2==3);
	}

}
