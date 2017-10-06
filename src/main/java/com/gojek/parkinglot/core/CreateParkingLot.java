package com.gojek.parkinglot.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to create or init the parking lot. This will be singleton class as only once it will be
 * initiated
 * @author Karthik
 */
public class CreateParkingLot {

    private static volatile CreateParkingLot instance;

    private List<Car> parkingSlots= null;

    private CreateParkingLot(int numberOfSlots){
        initCarParkingSlots(numberOfSlots);
    }

    /**
     * Singleton instance of this class
     * @return {@link CreateParkingLot}
     */
    private static synchronized CreateParkingLot getInstance(int numberOfSlots) {
        if (instance == null) {
            synchronized (CreateParkingLot.class) {
                if (instance == null) {
                    instance = new CreateParkingLot(numberOfSlots);
                }
            }
        }
        return instance;
    }

    /**
     * Returns the parking lot instance created
     * @return {@link CreateParkingLot}
     */
    public static CreateParkingLot getInstance(){
        if(instance == null){
            System.out.println("First create instance using createParkingLot(int) method");
            System.exit(1);
        }
        return instance;
    }

    /**
     * Create the instance of parking slot for given number
     * @param numberOfSlots to be created
     * @return {@link CreateParkingLot} singleton instance of this class
     */
    public static CreateParkingLot createParkingLot(int numberOfSlots){
        return getInstance(numberOfSlots);
    }

    /**
     * Method that will initialise the parking slot
     * @return the initial list of available slots
     */
    private void initCarParkingSlots(int numberOfSlots){
        parkingSlots = new ArrayList<Car>(numberOfSlots);
    }

    /**
     * Returns the parking slots
     * @return the available parking lots
     */
    public List<Car> getParkingSlots() {
        return parkingSlots;
    }
}
