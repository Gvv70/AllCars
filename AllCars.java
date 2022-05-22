package com.company;

public class AllCars {
    private int quantityWheels;
    private float lengthCars;
    private float widthCars;
    private float heightCars;
    private int weightCars;

    public AllCars(){
        System.out.println("General characteristics of cars:");
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }
    public void setQuantityWheels(){
        this.quantityWheels = quantityWheels;
    }

    public float getLengthCars() {
        return lengthCars;
    }

    public void setLengthCars() {
        this.lengthCars = lengthCars;
    }

    public float getWidthCars() {
        return widthCars;
    }

    public void setWidthCars() {
        this.widthCars = widthCars;
    }

    public float getHeightCars() {
        return heightCars;
    }

    public void setHeightCars() {
        this.heightCars = heightCars;
    }

    public int getWeightCars() {
        return weightCars;
    }

    public void setWeightCars() {
        this.weightCars = weightCars;
    }
}
