package freeclasses;

public class TeranaryAndIf_Else {
    public static void main(String[] args) {


       int x =2;                        //"2.KISIM UYARSA ÇALIŞCAK"  "2. KISIM UYMAZSA ÇALIŞACAK"
        System.out.println(x>2 ? x<4 ? "TERNARY İLE :2.şart uydu" :  "TERNARY İLE :2.şart uymadı":  "TERNARY İLE :1.şart uymadı");
                                      //"           1. ŞART UYARSA ÇALIŞACAK BÖLÜM              "   "1. KISIM UYMASSA ÇALIŞACAK KISIM"
        if (x>2){
            if (x<4){
                System.out.println("İF-ELSE İLE: 2.şart uydu");
            }else {
                System.out.println("İF-ELSE İLE: 2.şart uymadı");
            }
        }else {
            System.out.println("İF-ELSE İLE: 1.şart uymadı");
        }





    }





}