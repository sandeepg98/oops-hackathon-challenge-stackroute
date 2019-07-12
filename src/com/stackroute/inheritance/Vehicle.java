package com.stackroute.inheritance;

public class Vehicle {

    private String vehicleType;
    private String numerPlate;
    private String modelYear;
    private String fuelType;
    private int speed;
    private boolean insured;

    public Vehicle(String vehicleType, String numerPlate, String modelYear, String fuelType, int speed, boolean insured) {
        this.vehicleType = vehicleType;
        this.numerPlate = numerPlate;
        this.modelYear = modelYear;
        this.fuelType = fuelType;
        this.speed = speed;
        this.insured = insured;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumerPlate() {
        return numerPlate;
    }

    public void setNumerPlate(String numerPlate) {
        this.numerPlate = numerPlate;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", numerPlate='" + numerPlate + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", speed=" + speed +
                ", insured=" + insured +
                '}';
    }
}
