package com.stackroute.inheritance;

public class JeepCompass extends Car implements Gear, Speed, Steering{

    private String modelName;
    private int airbags;
    private boolean sunroof;
    private boolean navigationSystem;

    public JeepCompass(String vehicleType, String numerPlate, String modelYear, String fuelType, int speed, boolean insured, String carType, String brand, String wheelDriveType, String steerType, int gear, String modelName, int airbags, boolean sunroof, boolean navigationSystem) {
        super(vehicleType, numerPlate, modelYear, fuelType, speed, insured, carType, brand, wheelDriveType, steerType, gear);
        this.modelName = modelName;
        this.airbags = airbags;
        this.sunroof = sunroof;
        this.navigationSystem = navigationSystem;
    }

    public void start(){
        System.out.println("vroom....vroom.....VROOOMMM......");
    }

    public void stop(){
        System.out.println("brghhhh............");
    }

    public void brake(){
        System.out.println("Speed = 0!");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(boolean navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public int shiftGearUp(int gear){
        System.out.println("Gear changed from " + gear + " to " + (++gear));
        return gear;
    }

    public int shiftGearDown(int gear){
        System.out.println("Gear changed from " + gear + " to " + (--gear));
        return gear;
    }

    public double increaseSpeed(double speed, double increment){
        System.out.println("Speed changed from " + speed + " to " + (speed + increment));
        return (speed + increment);
    }

    public double decreaseSpeed(double speed, double decrement){
        System.out.println("Speed changed from " + speed + " to " + (speed - decrement));
        return (speed - decrement);
    }

    public void steerRight(){
        System.out.println("Car turning towards right......");
    }

    public void steerLeft(){
        System.out.println("Car turning towards left......");
    }

    @Override
    public String toString() {

        return super.toString() + "\n" + "JeepCompass{" +
                "modelName='" + modelName + '\'' +
                ", airbags=" + airbags +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }
}
