package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone cp = new Phone();
        System.out.println("What is the serial number?");
        cp.setSerialnumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("What model is the phone?");
        cp.setModel(scanner.nextLine());
        System.out.println("Who is the carrier?");
        cp.setCarrier(scanner.nextLine());
        System.out.println("What is the phone number?");
        cp.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        cp.setOwner(scanner.nextLine());
        System.out.printf("The %s with serial number %d by carrier %s and phone nr %s is owner by %s.", cp.getModel(), cp.getSerialnumber(), cp.getCarrier(), cp.getPhoneNumber(), cp.getOwner());

    }
}
