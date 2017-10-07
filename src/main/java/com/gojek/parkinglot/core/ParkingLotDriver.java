package com.gojek.parkinglot.core;

import com.gojek.parkinglot.core.interfaces.IExecutor;

/**
 * Driver class for Parking Lot
 * @author Karthik
 */
public class ParkingLotDriver {

    /**
     * Driver method to parse input from command line and execute the respective functions
     * @param args where args[0] will be input file path. If args is empty then interactive command
     *             shell will be invoked
     */
    public static void main(String[] args){
        IExecutor executor = InputFactory.getExecutor(args);
        executor.execute();
    }
}
