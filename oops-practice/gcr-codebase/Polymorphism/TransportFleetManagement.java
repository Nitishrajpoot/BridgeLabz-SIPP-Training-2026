package Polymorphism;

abstract class Vehicle {

    abstract double fuelCost(int km);
}

class Car extends Vehicle {
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportFleetManagement {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 100;

        for (Vehicle v : fleet) {
            System.out.println(
                    v.getClass().getSimpleName()
                    + " Cost = ₹" +
                    v.fuelCost(km)
            );
        }
    }
}
