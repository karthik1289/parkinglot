package com.gojek.parkinglot.core.parser;

/**
 * Class to validate the given input commands
 * @author Karthik
 */
public final class ValidateInputCommands {

    private static final String SPACE = " ";
    /**
     * Default private constructor
     */
    private ValidateInputCommands(){}

    /**
     * Method which will validate the given input command
     * @param command which will be executed
     * @return true if given command is valid else false
     */
    public static boolean isValidInputCommand(String command){
        boolean isValidCommand = false;
        if(command == null || command.trim().length() == 0){
            return isValidCommand;
        }
        String[] input = command.split(SPACE,-1);
        if(!ValidCommands.getValidCommands().contains(input[0])){
            System.out.println(input[0]+" is not a valid command");
            return false;
        }
        switch(ValidCommands.Commands.valueOf(input[0]).getValue()){
            //create_parking_lot command
            case 0:{
                isValidCommand = input.length == 2;
                if(!isValidCommand){
                    System.out.println("Need a Integer for creating parking slot");
                    return false;
                }
                try {
                    Integer.parseInt(input[1]);
                }
                catch (NumberFormatException exception){
                    System.out.println("Not a valid input format for command create_parking_lot");
                    return false;
                }
                return isValidCommand;
            }
            //park command
            case 1:{
                return input.length == 3;
            }
            //leave command
            case 2:{
                isValidCommand = input.length == 2;
                if(!isValidCommand){
                    System.out.println("Need a Integer for creating parking slot");
                    return false;
                }
                try {
                    Integer.parseInt(input[1]);
                }
                catch (NumberFormatException exception){
                    System.out.println("Not a valid input format for command create_parking_lot");
                    return false;
                }
                return isValidCommand;
            }
            //status command
            case 3:{
                return input.length == 1;
            }
            //registration_numbers_for_cars_with_colour command
            case 4:{
                return input.length == 2;
            }
            //slot_numbers_for_cars_with_colour command
            case 5:{
                return input.length == 2;
            }
            //slot_number_for_registration_number command
            case 6:{
                return input.length == 2;
            }
        }
        return isValidCommand;
    }
}
