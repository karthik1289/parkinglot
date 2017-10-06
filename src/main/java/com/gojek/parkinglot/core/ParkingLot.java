package com.gojek.parkinglot.core;

import java.util.List;

/**
 * Class represents all parking operations available
 * This is singleton class to give one instance of this
 * @author Karthik
 */
public class ParkingLot{

    private static volatile ParkingLot parkingLot;

    private static List<Car> parkingSlots;

    /**
     * Singleton instance of this class
     * @return {@link CreateParkingLot}
     */
    private static synchronized ParkingLot getInstance() {
        if (parkingLot == null) {
            synchronized (ParkingLot.class) {
                if (parkingLot == null) {
                    parkingLot = new ParkingLot();
                    parkingSlots = CreateParkingLot.getInstance().getParkingSlots();
                }
            }
        }
        return parkingLot;
    }

}
