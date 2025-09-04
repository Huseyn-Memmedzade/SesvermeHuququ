package yenipabka;

import java.util.Scanner;

public class SesvermeHuququ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yasinizi Daxil Edin");
        int age = sc.nextInt();

        String netice;

        netice = age>= 18 ? "Ses vere Biler" : "Ses vere Bilmez";
        System.out.println(netice);


    }


}
