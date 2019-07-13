package com.stackroute.inheritance;

public class Main {

    public static void main(String[] args){

        JeepCompass jeepCompass=new JeepCompass("Normal 4 wheeler", "PB03", "2019", "Diesel", 0, true, "SUV", "JEEP", "4 wheel drive", "Sports steering wheel", 6, "Trailhawk", 6, "key", true, true);

        jeepCompass.start();
        jeepCompass.shiftGearUp(0);
        jeepCompass.increaseSpeed(0,15);
        jeepCompass.steerLeft();
        jeepCompass.decreaseSpeed(15, 10);
        jeepCompass.brake();
        jeepCompass.shiftGearDown(1);
        jeepCompass.stop();

        jeepCompass.start("key");
        jeepCompass.stop("key");


        System.out.println(jeepCompass);
    }
}
