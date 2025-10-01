package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        String information = scanner.nextLine();
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        String addressBilling = scanner.nextLine();
        StringBuilder name = new StringBuilder();
        name.append(fullName + " ");
        String addressName = name.toString();
        System.out.println(name);
        StringBuilder addressInfo = new StringBuilder();
        addressInfo.append(billingStreet + " ");
        addressInfo.append(billingCity + " ");
        addressInfo.append(billingState + " ");
        addressInfo.append(billingZip);
        System.out.println("Billing Address:");
        String addressBilling1 = addressInfo.toString();
        System.out.println(addressBilling1);
        StringBuilder addressInfo2 = new StringBuilder();
        addressInfo2.append(shippingStreet + " ");
        addressInfo2.append(shippingCity + " ");
        addressInfo2.append(shippingState+ " ");
        addressInfo2.append(shippingZip + " ");
        System.out.println("Shipping Address:");
        String addressShipping1 = addressInfo2.toString();
        System.out.println(addressShipping1);
    }

}
