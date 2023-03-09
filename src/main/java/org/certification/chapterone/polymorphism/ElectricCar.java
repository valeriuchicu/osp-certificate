package org.certification.chapterone.polymorphism;

class Automobile {
    protected void stringToHello(){
        System.out.println("HELLO polymorphism============+++++++++ Automobile");
    }
    private final  String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    public void stringFromCar(){
        System.out.println("Hello from Car-----------");
    }
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    public void stringFromElectricCar(){
        System.out.println("Hello from ElectricCar-----------");
    }
    public static void main(String[] wheels) {
        final Automobile car = new ElectricCar();
        var v = car;
//        v.stringFromCar();
//        v.stringFromElectricCar();
//        System.out.println(v.drive());
        v.stringToHello();
        System.out.println(car.getClass());
    }

    public final String drive() {
        return "Driving electric car========================================";
    }
}
