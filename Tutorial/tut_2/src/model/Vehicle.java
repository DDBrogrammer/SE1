package model;

import java.nio.charset.Charset;

public class Vehicle {
    private double weight;
    private double length;
    private String registrationNumber;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws InvalidWeightException {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws InvalidLengthException {
        this.length = length;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) throws InvalidRegistrationNumberException {
        this.registrationNumber = registrationNumber;
    }

    public Vehicle(double weight, double length, String registrationNumber) {
        this.weight = weight;
        this.length = length;
        this.registrationNumber = registrationNumber;
    }

    public Vehicle() {
    }

    public boolean validateRegistrationNumber(String registrationNumber){
        return registrationNumber.length()>=6 && registrationNumber.length() <= 12;
    }

    public void travel( String fromDestination, String toDestination){
        System.out.println("\uD83D\uDE94  " + fromDestination +" \uD83D\uDD1C "+toDestination);
    }

}
