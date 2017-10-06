package com.gojek.parkinglot.core;

/**
 * Class reparesents a car which contains its number and colour
 * @author Karthik
 */
public class Car {

    private String carNumber;

    private String colour;

    /**
     * Constructor to initialise car number and colour
     * @param carNumber car number
     * @param colour colour of the car
     */
    public Car(String carNumber, String colour){
        this.carNumber = carNumber;
        this.colour = colour;
    }

    /**
     * Returns the car number
     * @return the car number
     */
    public String getCarNumber(){
        return this.carNumber;
    }

    /**
     * Returns the car colour
     * @return the car colour
     */
    public String getColour(){
        return this.colour;
    }
}
