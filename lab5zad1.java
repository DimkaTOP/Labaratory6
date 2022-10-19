package com.company;
import java.util.Scanner;
public class lab5zad1 {
    public static void main(String[] args) {
        Scanner kod = new Scanner(System.in);
        int ad,af,result;
        System.out.print("Введите число от 1 до 10: ");
        ad = kod.nextInt();
        System.out.print("Введите любое целое числo: ");
        af = kod.nextInt();
        result = ad + af;
        System.out.print("Result is: " + result);




    }
}
