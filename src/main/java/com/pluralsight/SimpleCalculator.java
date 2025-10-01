package com.pluralsight;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int nr1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me another number");
        int nr2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("choose an operation: + - * or /");
        String operation = scanner.nextLine();
        double result;
        if (operation.equals("+")){
            result = nr1 + nr2;
            System.out.println(nr1 + nr2);
        }else if (operation.equals("-")){
            result = nr1 - nr2;
            System.out.println(nr1 - nr2);
        }else if (operation.equals("*")){
            result = nr1 * nr2;
            System.out.println(nr1 * nr2);
        }else if (operation.equals("/")){
            result = nr1 / nr2;
            System.out.println(nr1 / nr2);
        }
    }
}
