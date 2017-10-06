package com.gojek.parkinglot.core.interfaces;

/**
 * Interface holds the all parking functions
 * @author Karthik
 */
public interface IParkingFunctions {
    /**
     * Method to park the car for given registration number and car colour
     * @param registrationNumber of car
     * @param colour of car
     */
    void parkCar(String registrationNumber, String colour);

    /**
     * Method to leave parking
     * @param slot number which needs to be emptied
     */
    void leaveParking(Integer slot);

    /**
     * Returns the current status
     */
    void getStatus();

    /**
     * Get all registration number of cars with the given colour
     * @param colour of car
     */
    void getRegistrationNumberWithColour(String colour);

    /**
     * Returns the all slot number for given car colour
     * @param colour of the car
     */
    void getSlotWithColour(String colour);

    /**
     * returns the slot number of the car for given registration number
     * @param registrationNumber of car
     */
    void getSlotWithRegistrationNumber(String registrationNumber);
}
