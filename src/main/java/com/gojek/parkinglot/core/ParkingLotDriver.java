package com.gojek.parkinglot.core;

import com.gojek.parkinglot.core.utils.StringUtils;

/**
 * Driver class for Parking Lot
 * @author Karthik
 */
public class ParkingLotDriver {

    private static String filePath;

    /**
     * Driver method to parse input from command line and execute the respective functions
     * @param args where args[0] will be input file path. If args is empty then interactive command
     *             shell will be invoked
     */
    public static void main(String[] args){
        switch (args.length){
            case 0 : {
                System.out.println("Interactive command shell will be invoked");
            }
            break;
            case 1 : {
                filePath = args[0];
                if(StringUtils.isValidFile(filePath)){
                    System.out.println("Commands in file will be executed");
                }
            }
            break;
            default:{
                System.out.println("Invalid run time arguments. Either pass file name or dont pass" +
                    "anything for interactive command shell");
            }
        }
    }
}
