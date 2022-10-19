package com.company;
import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner ggp = new Scanner(System.in);
        int lop;
        String ht = "Привет!";
        System.out.println(ht);
        String hq = "Сколько будет 150 + 200?";
        System.out.println(hq);
        lop = ggp.nextInt();
        if (lop == 350){
            System.out.println("Это верно!");}
        else {
            if (lop>0){
                System.out.println("Ложь!");}
            else {
                System.out.println("Абсолютная ложь!");}
        }
        int fg;
        String sss = "Продолжим?";
        System.out.println(sss);
        String qwe = "Сколько будет 300+200?";
        System.out.println(qwe);
        fg = ggp.nextInt();
        if (fg == 500){
            System.out.println("Правильно!");}
        else {
            if (fg>0){
                System.out.println("Мимо!");}
        else{
                System.out.println("Неправда!");
            }
        }
    }
}
