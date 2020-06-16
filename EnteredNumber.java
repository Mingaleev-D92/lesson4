package ru.innopolis.university.mingaleev.homework_4_1;

import java.util.Scanner;

public class EnteredNumber {
    public static void main(String[] args) {
        double number;
        System.out.println("Введите число:");
        Scanner inputScanner = new Scanner(System.in);
        number = inputScanner.nextDouble();
        if (number > 0 && number % 2 == 0) {
            System.out.println("Ваше число положительное и четное.");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("Ваше число отрицательное и четное.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Ваше число положительное и нечетное.");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("Ваше число отрицательное и нечетное.");
        } else if (number == 0) {
            System.out.println("Ваше число ноль");
        }
    }
}
