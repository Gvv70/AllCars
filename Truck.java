package com.company;
import java.util.Scanner;

public class Truck extends AllCars{
    int quantityWheels;
    float lengthCars;
    float widthCars;
    float heightCars;
    int weightCars;

    @Override
    public int getQuantityWheels() {
        System.out.println("Truck has " + quantityWheels + " wheels.");
        return quantityWheels;
    }
    @Override
    public void setQuantityWheels(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input quantity wheels of your truck: ");
        quantityWheels = scanner.nextInt();
    }
    @Override
    public float getLengthCars() {
        System.out.println("Truck has a length of " + lengthCars + " meters.");
        return lengthCars;
    }
    @Override
    public void setLengthCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of your truck (m): ");
        lengthCars = scanner.nextFloat();
    }
    @Override
    public float getWidthCars() {
        System.out.println("Truck has a width of " + widthCars + " meters.");
        return widthCars;
    }
    @Override
    public void setWidthCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width of your truck (m): ");
        widthCars = scanner.nextFloat();
    }
    public float getHeightCars() {
        System.out.println("Truck has a height of " + heightCars + " meters.");
        return heightCars;
    }

    public void setHeightCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height of your truck (m): ");
        heightCars = scanner.nextFloat();
    }
    public int getWeightCars() {
        System.out.println("Truck has a weight of " + weightCars + " meters.");
        return weightCars;
    }

    public void setWeightCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight of your truck (kg): ");
        heightCars = scanner.nextInt();
    }

}
