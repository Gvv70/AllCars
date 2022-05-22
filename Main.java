package com.company;

public class Main {

    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar();

        passengerCar.setQuantityWheels();
        passengerCar.getQuantityWheels();
        passengerCar.setLengthCars();
        passengerCar.getLengthCars();
        passengerCar.setWidthCars();
        passengerCar.getWidthCars();
        passengerCar.setHeightCars();
        passengerCar.getHeightCars();
        passengerCar.setWeightCars();
        passengerCar.getWeightCars();

        Bus bus = new Bus();
        bus.setQuantityWheels(6);
        bus.getQuantityWheels();
        bus.setLengthCars();
        bus.getLengthCars();
        bus.setWidthCars();
        bus.getWidthCars();
        bus.setHeightCars();
        bus.getHeightCars();
        bus.setWeightCars();
        bus.getWeightCars();

        SUV suv = new SUV();
        suv.setQuantityWheels();
        suv.getQuantityWheels();
        suv.setLengthCars();
        suv.getLengthCars();
        suv.setWidthCars();
        suv.getWidthCars();
        suv.setHeightCars();
        suv.getHeightCars();
        suv.setWeightCars();
        suv.getWeightCars();

        Truck truck = new Truck();
        truck.setQuantityWheels();
        truck.getQuantityWheels();
        truck.setLengthCars();
        truck.getLengthCars();
        truck.setWidthCars();
        truck.getWidthCars();
        truck.setHeightCars();
        truck.getHeightCars();
        truck.setWeightCars();
        truck.getWeightCars();
    }
}
