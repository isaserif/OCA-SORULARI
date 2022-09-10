package freeclasses;

import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
            int note=scan.nextInt();

            if ( note>=0&&note<50){
                System.out.println("notunuz: F");
            }else if (note>=50&&note<70){
                System.out.println("notunuz: D");
            }else if (note>=70&&note<80){
                System.out.println("notunuz: C");
            }else if (note>=80&&note<90){
                System.out.println("notunuz: B");
            }else if (note>=90&&note<=100){
                System.out.println("notunuz: A");
            }else {
                System.out.println("yanlış bir not girdiniz");
            }

        System.out.println    ((note>=0&&note<50)?(note>=50&&note<70)?(note>=70&&note<80)?(note>=80&&note<90)?(note>=90&&note<=100)?
                "F":                  "D":                "C":         "B":      "A" :"" );

    }
}
