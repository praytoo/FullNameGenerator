package com.pluralsight;

public class CellPhoneService {
        public static void main(String[] args) {
            Phone phone1 = new Phone();
            phone1.setSerialnumber(99999999);
            phone1.setModel("iPhone 13");
            phone1.setCarrier("T-mobile");
            phone1.setPhoneNumber("310-844-2637");
            phone1.setOwner("Prince Haywood");

            Phone phone2 = new Phone();
            phone2.setSerialnumber(1111111);
            phone2.setModel("iPhone X");
            phone2.setCarrier("Verizon");
            phone2.setPhoneNumber("310-123-4567");
            phone2.setOwner("Saint Praytoo");

            display(phone1);
            display(phone2);

            phone1.dial(phone2.getPhoneNumber() );
            phone2.dial(phone1.getPhoneNumber() );

        }
    public static void display(Phone phone) {
        System.out.println("Phone info: ");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Serial Number: " + phone.getSerialnumber());
        System.out.println("-------------");
    }
    }
