package Day11;
public class C01_Equals {
    public static void main(String[] args) {
        
        
        String str1= "Ali Kahyaoglu";
        System.out.println(str1.length());//uzunluğunu verir bize
        System.out.println(str1.charAt(str1.length()-1));//son indeksi verir

        String str2="";
        System.out.println(str2.length());
        
        String str3=null;
       // System.out.println(str3.length());
        //Oluşturdum ama değer atamadım.
        
       // String str4=;
        System.out.println(str3);
        //System.out.println(str4);//str4 değer atamadık daha sonra kullanacağız diye..
        //        String str2= "Can";
//        String str3= "Ali Can";
//        String str4= str1 + " " + str2; 
//        
//        System.out.println(str4); // Ali Can
//        System.out.println(str3==str4); // false
//        System.out.println(str3.equals(str4));// true
//        System.out.println(str3.equalsIgnoreCase(str4));//buyük küçük içeriği önemseme
//        
        
        // String variable'larda == hem degere hem de referansina bakar dolayisiyla objeler farkli oldugunda 
        // genelde false doner
        // str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
        // eger case sensitive olarak String degerleri ayni ise true doner
    }
}