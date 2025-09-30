package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner scanner = new Scanner(System.in);
    public class FullNameApplication{
}
    public static void main(String[] args) {

    System.out.println("What's your first name?");
    String firstName = scanner.nextLine();
    firstName = firstName.trim();
    System.out.println("What's your middle initial?");
    String middleInitial = scanner.nextLine();
    middleInitial = middleInitial.trim();
    System.out.println("What's your last name?");
    String lastName = scanner.nextLine();
    lastName = lastName.trim();
    System.out.println("Do you have a suffix? yes/no");
    boolean suffix = scanner.nextLine().equalsIgnoreCase("yes");
    String suffix1 = "";
    if (suffix){
        System.out.println("What's your suffix?");
        suffix1 = scanner.nextLine();
        suffix1 = suffix1.trim();
    }
    String fullName = (firstName + " " + middleInitial + " " + lastName + " " + suffix1);
    System.out.println(fullName);
    }

}