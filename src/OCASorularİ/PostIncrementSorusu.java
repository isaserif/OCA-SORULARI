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
            }

    }
}
