package kuvvet;

import java.util.Scanner;

public class kuvvet {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kütle deðerini giriniz:");
        int m = scanner.nextInt();
        System.out.println("Ývme deðerini giriniz:");
        int a = scanner.nextInt();
       
        int F = m*a ;
        System.out.println("Kuvvet : " +F);
    }
}
