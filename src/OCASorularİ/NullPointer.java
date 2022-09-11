package OCASorularİ;

public class NullPointer {
    public static void main(String[] args) {
        // Aşağıdaki kod bloğunda output nedir?

      /*  int x =0;
        String s =null;

        if (x==null){
            System.out.println("");
        }else {
            System.out.println("Failure");
        }
            //Bu kod çalışmaz neden?
      //1-null kendine özel bir yapıdır ne string ne de integer dir.
      //prmitive data türleri için null pointer kullanılmaz.
*/
        Integer sayi = null;
        Boolean bl = null;
        //non-primitive tüm data türlerinde null pointer kullanılabir.

        String str1;
        //String str2 = new String();
        String str3 = "";
        String str4 = null;
        str4="";
        System.out.println(str4);
        // bu 4 veriable atama açısından aynı durumdadır
        // hepsine yeni değer atanabilir ve kullanılabir.
        // null ataması yaptığımız String i yazdırdığımızda "null" sonucunu görürüz. bu
        //bir string değil sadece str4 e null atandığının işaretidir.

        //bir string e manipılation yapabiliriz
        System.out.println("java "+str4);













    }
}
