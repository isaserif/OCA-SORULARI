package OCASorularİ;

public class DataCasting {
    public static void main(String[] args) {
       /*Aşağıdaki kod da yapacağımız hangi değişiklik kodun
        kodun çalışmasını sağlar*/

 /*
        A. Degisiklige gerek yok; oldugu gibi calisir.// yanlış
        B. 9.satirdaki x'i int'a cast etmek.(çalışır)
        //long x=10;
        int y= (int) (2*x);

        C. Change the data type of x on line 8 to short.
        short x=10;
        int y=  (2*x);

        D. Cast 2 * x on line 9 to int.
        long x=10;
        int y=  (int) (2*x);

        E. Change the data type of y on line 9 to short.
        long x=10;
        int y=  (int) (2*x);//olmaz long short tan büyük
         long x=10;
        short y=   (2*x);
        F. Change the data type of y on line 9 to long.
        long x=10;
        long y=   (2*x);
         */

        //DataCasting: primitive ve sayısal data türlerindeki verileri birbirlerine çevirmek
        //byte(8bit),short, int, float, double
        // küçük eşya büyük kaba otomatik olarak sığar,

        long x=10;
        long y=   (2*x);
        System.out.println(y);








        byte num1=15;
        short num2=num1;

        long num3=1500;
        double num4=num3;


         int num5=65;
        short num6= (short) num5;//(short) int büyük olmasına rağmen short a sığar deriz
       num5=150;
       byte num7= (byte) num5;
        System.out.println(num7);//num7=-106





    }
}
