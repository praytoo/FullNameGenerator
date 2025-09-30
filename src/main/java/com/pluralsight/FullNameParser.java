package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name like: first last");
        String firstLast = scanner.nextLine();
        firstLast = firstLast.trim();
        String input = firstLast;
        String[] names = firstLast.split(" ");
        String firstName = names[0];
        String lastName = names[1];

        System.out.println();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
}
