package com.company;
import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int si;
        String http = "Введите любое число от 1 до 100";
        System.out.println(http);
        si = io.nextInt();
        switch (si) {
            case 78:
                System.out.println("4! ВЫ ВЫЙГРАЛИ 265365817$");
                break;
            case 34:
                System.out.println("10! ВЫ ВЫЙГРАЛИ 10000$");
                break;
            case 66:
                System.out.println("40! ВЫ ВЫЙГРАЛИ 890013$");
                break;
            case 18:
                System.out.println("89! ВЫ ВЫЙГРАЛИ 200000$");
                break;
            default:
                System.out.println("Вы не угодали!");
        }
    }
}
