package com.gojek.parkinglot.core.parser;

import com.gojek.parkinglot.core.CreateParkingLot;
import com.gojek.parkinglot.core.ParkingLot;

public final class CommandExecutor {

    /**
     * Default Private Constructor
     */
    private CommandExecutor(){}

    /**
     * Invokes appropriate command for each input
     * @param input command which needs to be executed
     */
    public static void executeCommand(String[] input){
        switch (ValidCommands.Commands.valueOf(input[0]).getValue()){
            //create_parking_lot command
            case 0 : {
                CreateParkingLot.createParkingLot(Integer.parseInt(input[1]));
            }
            break;
            //park command
            case 1 : {
                ParkingLot.getInstance().parkCar(input[1],input[2]);
            }
            break;
            //leave command
            case 2 : {
                ParkingLot.getInstance().leaveParking(Integer.parseInt(input[1]));
            }
            break;
            //status command
            case 3 : {
                ParkingLot.getInstance().getStatus();
            }
            break;
            //registration_numbers_for_cars_with_colour command
            case 4 : {
                ParkingLot.getInstance().getRegistrationNumberWithColour(input[1]);
            }
            break;
            //slot_numbers_for_cars_with_colour command
            case 5 : {
                ParkingLot.getInstance().getSlotWithColour(input[1]);
            }
            break;
            //slot_number_for_registration_number command
            case 6 : {
                ParkingLot.getInstance().getSlotWithRegistrationNumber(input[1]);
            }
            break;
            default:{
                System.out.println("InValid Command "+input[0]);
                break;
            }
        }
    }

}
