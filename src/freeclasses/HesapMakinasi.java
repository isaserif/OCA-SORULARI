package freeclasses;

import java.util.Scanner;

public class HesapMakinasi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen işlem giriniz");
        String islem = scan.nextLine();
        System.out.println("lütfen num1 değerini giriniz");
        int num1 = scan.nextInt();
        System.out.println("lütfen num2 değerini giriniz");
        int num2 = scan.nextInt();

           String işlem="";
        if (işlem=="+"){
                    System.out.println(num1 + num2);
        }else if (işlem=="-") {
                    System.out.println(num1 - num2);
        }else if  (işlem=="*") {
                    System.out.println(num1 * num2);
        }else if  (işlem=="/"){
                System.out.println(num1/num2);
        }else {
            System.out.println("işlem hatası");}
    }


    }

