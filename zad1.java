package com.company;
import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {
        Scanner nub = new Scanner(System.in);
        String str = "Введите любое целое число от 1 до 3: ";
        System.out.print(str);
        int bok = nub.nextInt();
        System.out.print("Вы ввели число: " + bok);

    }
}
