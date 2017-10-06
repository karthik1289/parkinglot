package com.gojek.parkinglot.core.parser;

/**
 * Class to validate the given input commands
 * @author Karthik
 */
public final class ValidateInputCommands {
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
        String[] input = command.split(" ",-1);
        if(!ValidCommands.getValidCommands().contains(input[0])){
            System.out.println(input[0]+" is not a valid command");
            return false;
        }
        switch(ValidCommands.Commands.valueOf(input[0]).getValue()){
            case 0:{
                isValidCommand = input.length == 2;
                try {
                    Integer.parseInt(input[1]);
                }
                catch (NumberFormatException exception){
                    System.out.println("Not a valid input format for command create_parking_lot");
                    return false;
                }
                return isValidCommand;
            }
            case 1:{
                isValidCommand = input.length == 3;
                return isValidCommand;
            }
            case 2:{
                isValidCommand = input.length == 2;
                try {
                    Integer.parseInt(input[1]);
                }
                catch (NumberFormatException exception){
                    System.out.println("Not a valid input format for command leave");
                    return false;
                }
                return isValidCommand;
            }
            case 3:{
                return input.length == 1;
            }
            case 4:{
                return input.length == 2;
            }
            case 5:{
                return input.length == 2;
            }
            case 6:{
                return input.length == 2;
            }
        }
        return isValidCommand;
    }
}
