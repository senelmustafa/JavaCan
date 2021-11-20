package Scope;

public class InstanceVar {

	int notMat = 50;
	int notFen;

//instance varible scopenda main method yoktur
	public static void main(String[] args) {

//System.out.println(notMat);//main method static olduu için stat
//static olmayan varible  main method direk kullanılmaz veya görüntülenmez

		
		//instance variable lara main methodlara ulaşmak istersek
		//obj üzerinden erişim salayabiliriz.
		//scanner scan=new scannner(system.in);
		//İçinde olduumuz class dan bir oble oluşturmak için 
		InstanceVar celil=new InstanceVar();
		System.out.println(celil.notMat);//static olmadığı halle bu variableye ulaşabildim
		 					//50 idi gördüm.
		
		InstanceVar mustafa=new InstanceVar();
		mustafa.notMat=70;
		System.out.println(mustafa.notMat);
		System.out.println("celil eski not "+celil.notMat);
		//celilin notunu değiştirmek istiyorsal celil.notMat a değer atamalıyız.
		celil.notMat =100;
		System.out.println("celil yeni not "+celil.notMat);
		//method2();//method 2 static klübünden olmadıı için direk çağrılamaz
		celil.method2();
	}	

	public static void staticMethod() {
		
	

	}

	public void method2() {
		System.out.println("method2  değer> "+ notFen);
		//bu methos static olmadığı için variblelere ulaşabilir.
//değere javaya default atar Java " 0 "atar.
		notFen=95;
		System.out.println("method2  değer> "+ notFen);
	}
}
