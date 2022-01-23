package Java_Ornekler;

import java.util.IllegalFormatFlagsException;
import java.util.Scanner;

public class WhileDongusu2 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
         int tk=0;
        int cift=0;
        
      while(true) {
    	  System.out.println("bir sayı giriniz :");
    	  int sayi=scan.nextInt();
    	  if(sayi%2==0) {
    		  cift++;
    	  }if(sayi%2==1) {
    		  tk++;
    	  }
    	  if(sayi==0) {
    		  System.out.println("Sistemden Çıkıldı..");
    		  break;
    	  }
    	    	  
      }     System.out.println("tek sayi "+ tk);
      		System.out.println("cift sayi "+ cift);
           	 
       
         }
  }


        

           
    
    
    
 
