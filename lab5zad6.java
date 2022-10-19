package com.company;
import java.util.Scanner;
public class lab5zad6 {
    public static void main(String[] args) {
        Scanner dro = new Scanner(System.in);
        float def,t,result;
        def = dro.nextFloat();
        System.out.println("Вы ввели: " + def);
        t = dro.nextFloat();
        System.out.println("Вы ввели: " + t );
        result = def + t;
        System.out.println("Result is: " + result);
    }
}
