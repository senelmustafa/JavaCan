import java.util.Scanner;

public class While_Dongusu1 {
    public static void main(String[] args) {
        //kullanıdan sayı isteyip ortalamasını hesaplayacağız
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 10 adet sayı giriniz :");
        float ortalama;
        int sayac=1;
       float toplam=0;

        while (sayac<=10){
            System.out.println(sayac+". sayıyı giriniz :");
            
            toplam= toplam+scan.nextInt();
            sayac++;
        } ortalama=toplam/10;
        System.out.println("10 sayının ortalaması :"+ortalama);

    }
    
}
