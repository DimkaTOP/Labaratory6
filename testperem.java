package com.company;
import java.util.Scanner;
public class testperem {
    public static void main(String[] args) {
        Scanner juk = new Scanner(System.in);
        String str = "Сколько будет 10-6?";
        System.out.println(str);
        int go;
        go = juk.nextInt();
        System.out.println(go);
        if (go == 4) {
            System.out.println("Да! это четыре");
        } else {
            if (go > 3) {
                System.out.println("Ты переборщил!");
            } else {
                System.out.println("Ответ неверный!");
            }
        }
        String gip = "Далее";
        System.out.println(gip);
        int yr;
        String gm = "Сколько будет 20+20?";
        System.out.println(gm);
        yr = juk.nextInt();
        if (yr == 40) {
            System.out.println("Да, верно!");
        } else {
            if (yr > 39) {
                System.out.println("Ты переборщил!");
            } else {
                System.out.println("Маловато!");
            }
        }
        String gu = "Вперед!";
        int tW;
        System.out.println(gu);
        String po = "Сколько будет 12+8";
        System.out.println(po);
        tW = juk.nextInt();
        if (tW == 20){ System.out.println("Правильно!");}
        else {
            if (tW>19) {System.out.println("Ты переборщил!");}
            else {System.out.println("Ответ неверный!");}
        }
    }
}
