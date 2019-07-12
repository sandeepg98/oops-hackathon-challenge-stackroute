package com.stackroute.inheritance;

public class Car extends Vehicle {

    private String carType;
    private String brand;
    private String wheelDriveType;
    private String steerType;
    private int gear;

    public Car(String vehicleType, String numerPlate, String modelYear, String fuelType, int speed, boolean insured, String carType, String brand, String wheelDriveType, String steerType, int gear) {
        super(vehicleType, numerPlate, modelYear, fuelType, speed, insured);
        this.carType = carType;
        this.brand = brand;
        this.wheelDriveType = wheelDriveType;
        this.steerType = steerType;
        this.gear = gear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWheelDriveType() {
        return wheelDriveType;
    }

    public void setWheelDriveType(String wheelDriveType) {
        this.wheelDriveType = wheelDriveType;
    }

    public String getSteerType() {
        return steerType;
    }

    public void setSteerType(String steerType) {
        this.steerType = steerType;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Car{" +
                "carType='" + carType + '\'' +
                ", brand='" + brand + '\'' +
                ", wheelDriveType='" + wheelDriveType + '\'' +
                ", steerType='" + steerType + '\'' +
                ", gear=" + gear +
                '}';
    }
}
