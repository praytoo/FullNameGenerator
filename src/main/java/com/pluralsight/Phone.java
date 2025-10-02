package com.pluralsight;

public class Phone {
    private int serialnumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public void dial(String phoneNumber) {
            System.out.println(owner + " phone is calling " + phoneNumber);
    }

    public Phone() {
        serialnumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
