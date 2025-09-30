package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name");
        String lastName = scanner.nextLine();
        System.out.println("date of the show (dd MM yyyy)");
        String strdate = scanner.nextLine();
        LocalDate date = LocalDate.parse(strdate, DateTimeFormatter.ofPattern("dd MM yyyy"));
        System.out.println("and the number of tickets you will need");
        int NrTicks = scanner.nextInt();
        scanner.nextLine();
        String ticketWord = (NrTicks > 1) ? "tickets" : "ticket";
        System.out.printf("%d %s reserved for %s under %s, %s%n",NrTicks, ticketWord, date, lastName, firstName);

    }
    }
