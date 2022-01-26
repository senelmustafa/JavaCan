
public class Kokalma {

	public static void main(String[] args) {
		/* Günün sorusu: if statement
	      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

	        ax^2 + bx + c;

	        Çözüm adımları
	        kullanıcıdan a,b,c yi okutun.
	        Delta = bb - 4ac
	        
	        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
	        Delta = 0 => 1 tane kök vardır x = -b/2a
	        Delta < 0 ise kök yoktur.
	   */
		double a,b,c,delta ;
		a=1;
		b=10;
		c=2;
		
		delta=Math.pow(b, 2)-(4*a*c);
		
		if (delta>0 ) {
			System.out.println("x1="+(-b+Math.pow(delta, 1/2))/2*a);
			 
		} else if(delta>1){
			System.out.println("x="+((-b)/2*a));
		}else {
			System.out.println("kök yoktur");
		
		}
		
	}

}
