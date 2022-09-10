package freeclasses;

import java.util.Scanner;

public class Pramit {
    public static void main(String[] args) {
//Kullanıcıdan bir sayı alalım
Scanner scan=new Scanner(System.in);
        System.out.print("satır sayısını giriniz: ");//kullanıcıdan satır sayısını alalım
        int satırSayısı= scan.nextInt();
        for (int satır=0; satır<satırSayısı;  satır++){

            // her satırın başına boşluk koymalıyız
            for (int bosluk=0; bosluk<satırSayısı-(satır);bosluk++){
                //Her satırın başına boşluk bırakmak için
                System.out.print(" ");
            }
             for (int yildiz=0; yildiz<1+(satır*2);yildiz++){
        //yıldız sayısı her seferinde 2 ve katları olarak arttığı için satır sayısını
        //2 ile çarpıyoruz. her seferinde 1 satır arttıracağımız için +1 koyduk
        System.out.print("*");
    }
            System.out.println();
}







    }}

