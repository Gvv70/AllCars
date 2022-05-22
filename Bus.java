package com.company;
import java.util.Scanner;

public class Bus extends AllCars{
    int quantityWheels;
    float lengthCars;
    float widthCars;
    float heightCars;
    int weightCars;

    @Override
    public int getQuantityWheels() {
        System.out.println("Bus has " + quantityWheels + " wheels.");
        return quantityWheels;
    }
    @Override
    public void setQuantityWheels(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input quantity wheels of your Bus: ");
        quantityWheels = scanner.nextInt();
    }

    public void setQuantityWheels(int qWheels){
        quantityWheels = qWheels;
    }
    @Override
    public float getLengthCars() {
        System.out.println("Bus has a length of " + lengthCars + " meters.");
        return lengthCars;
    }
    @Override
    public void setLengthCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of your Bus (m): ");
        lengthCars = scanner.nextFloat();
    }
    @Override
    public float getWidthCars() {
        System.out.println("Bus has a width of " + widthCars + " meters.");
        return widthCars;
    }
    @Override
    public void setWidthCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input width of your Bus (m): ");
        widthCars = scanner.nextFloat();
    }
    public float getHeightCars() {
        System.out.println("Bus has a height of " + heightCars + " meters.");
        return heightCars;
    }

    public void setHeightCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height of your Bus (m): ");
        heightCars = scanner.nextFloat();
    }
    public int getWeightCars() {
        System.out.println("Bus has a weight of " + weightCars + " meters.");
        return weightCars;
    }

    public void setWeightCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight of your Bus (kg): ");
        heightCars = scanner.nextInt();
    }
}
