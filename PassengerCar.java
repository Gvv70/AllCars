package com.company;
import java.util.Scanner;

public class PassengerCar extends AllCars{
    int quantityWheels;
    float lengthCars;
    float widthCars;
    float heightCars;
    int weightCars;

    @Override
    public int getQuantityWheels() {
        System.out.println("Passenger Car has " + quantityWheels + " wheels.");
        return quantityWheels;
    }
    @Override
    public void setQuantityWheels(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input quantity wheels of your Passenger Car: ");
        quantityWheels = scanner.nextInt();
    }
    @Override
    public float getLengthCars() {
        System.out.println("Passenger Car has a length of " + lengthCars + " meters.");
        return lengthCars;
    }
    @Override
    public void setLengthCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of your Passenger Car (m): ");
        lengthCars = scanner.nextFloat();
    }
    @Override
    public float getWidthCars() {
        System.out.println("Passenger Car has a width of " + widthCars + " meters.");
        return widthCars;
    }
    @Override
    public void setWidthCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width of your Passenger Car (m): ");
        widthCars = scanner.nextFloat();
    }
    public float getHeightCars() {
        System.out.println("Passenger Car has a height of " + heightCars + " meters.");
        return heightCars;
    }

    public void setHeightCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height of your Passenger Car (m): ");
        heightCars = scanner.nextFloat();
    }
    public int getWeightCars() {
        System.out.println("Passenger Car has a weight of " + weightCars + " meters.");
        return weightCars;
    }

    public void setWeightCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight of your Passenger Car (kg): ");
        heightCars = scanner.nextInt();
    }
}
