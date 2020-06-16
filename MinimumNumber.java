package ru.innopolis.university.mingaleev.homework_4_1;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        double a, b;

        System.out.println("Введите первое число для сравнения:");

        Scanner inputScanner = new Scanner(System.in);
        a = inputScanner.nextDouble();

        System.out.println("Введите второе число для сравнения:");

        b = inputScanner.nextDouble();

        if (a < b) {
            System.out.println("Первое число меньше второго");
        } else if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Второе число меньше первого");

        }
    }
}

