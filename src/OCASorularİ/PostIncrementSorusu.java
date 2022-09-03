package OCASorularİ;

public class PostIncrementSorusu {
    public static void main(String[] args) {

        /*
        Given num1 as 9 in the code block below
         What happens to the output?
         */
        //postIncrement: önce atama yap sonra arttır.
        //preIncrement: önce değer arttır sonra ata
        int num1=9;
        int num2=num1++;// postıncrement

            if (num2<10){
                System.out.println(num2+ " Hello word");
            }else {
                System.out.println(num1+ "Hello universal");
                /* postIncrement olduğu için önce num2 ye num1 değeri atanıyor.
                num2=9  olur
                ardından num1 e 1 arttırılıyor
                num1=10 olur
                num2 10 dan küçük olduğu için ; System.out.println(num2+ " Hello word");  çalışır.

                eğer int num2=++num1; preIncrement olsaydı
                num2=10 olur
                num1=10 olur.
                */


            }

    }
}
