package OCASorularİ;

public class SwitchCase {
    public static void main(String[] args) {
       // switch -case   : if-else ile yapabilceğimiz yapılarda ihtimaller çok fazla
        // ise kullandığımız bir yöntemdir.

        final char a= 'A',d='D';// "final" keyword variable in son değerini belirler.

        char grade='B';
        switch (grade){
            case  a:
            case 'B':                               //başlangıç
                System.out.print("great ");
            case 'C':
                System.out.print("good ");break;     //bitiş
            case d:
            case 'F':
                System.out.print(" not good");
        }
        //not:    switc-case kodlarında başlangıcı case deki değer ile switc deki değerin uyumu
        //belirler ama bitişi break belirler

    }
}
