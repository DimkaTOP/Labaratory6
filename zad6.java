package com.company;
import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner www = new Scanner(System.in);
        int di;
        String jok = "Привет!";
        System.out.println(jok);
        String re = "Сколько будет 20+20?";
        System.out.println(re);
        di = www.nextInt();
        if (di == 40) {
            System.out.println("Да, это сорок! Молодец");
        } else {
            if (di > 39) {
                System.out.println("Ошибочка вышла!");
            }
            else {
                System.out.println("Ответ неверен!");}

        }
    }
}
