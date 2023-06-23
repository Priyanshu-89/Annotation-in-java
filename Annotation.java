import java.io.*;

interface Vehicle {
    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);
}

// This is for Bicycle

class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed + decrement;
    }

    public void printStates() {
        System.out.println("SPEED :" + speed  + "GEAR :" + gear);
    }
}

//This is for Bikes

class Bikes implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override
    public void speedUp(int increment){
        speed=speed+increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed=speed-decrement;
    }

    public void printStates(){
        System.out.println("SPEED :"+speed + "GEAR :"+gear);
    }

}

public class Annotation {

    public static void main(String[] args) {

        //reference of bicycle
        System.out.println("For Bicycle details");
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.printStates();

        //reference of bikes
        System.out.println("For Bikes details");
        Bikes bikes=new Bikes();
        bikes.applyBrakes(3);
        bikes.changeGear(2);
        bikes.speedUp(4);
        bikes.printStates();


    }

}
