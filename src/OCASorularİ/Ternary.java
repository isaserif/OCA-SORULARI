package OCASorularİ;

public class Ternary {
    public static void main(String[] args) {

        // Ternary: if else ile yazılan bir kodu tek satırda yazma
        /*
        What happens to the output when the code block below is run?
         */

        int x =5;
        System.out.println(x>2 ? x<4 ? 10 : 8: 7);
/*
       1. aşama:    "5" 2 den büyük olduğu için "x<4 ? 10 : 8" bölümü çalışır ve ": 7" devre dışı kalır.
       2. aşama:     "5" 4 den büyük olduğu için  ": 8" bölümü çalışır ve ekrana 8 yazdırır.
*/


        // verilen bir sayının tek veya çift olduğunu yazdıran bir kod yazınız.
        //if else ile
        int sayi1=20;
        if (sayi1%2==0){
            System.out.println("sayı çifttir");
        }else {
            System.out.println("sayı tektir");
        }

        //Ternary ile

        int sayı2=5;


        System.out.println(sayı2%2==0?"sayı çifttir":"sayı tektir");









    }
}
