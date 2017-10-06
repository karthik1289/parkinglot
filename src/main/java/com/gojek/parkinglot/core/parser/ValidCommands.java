package com.gojek.parkinglot.core.parser;

import java.util.HashSet;

/**
 * Class which holds the valid commands
 * @author Karthik
 */
public class ValidCommands {

    private static HashSet<String> validCommands = new HashSet<String>();

    /**
     * Returns the available commands
     * @return validCommands set
     */
    public static HashSet<String> getValidCommands(){
        if (validCommands.size() == 0){
            initValidCommands();
        }
        return validCommands;
    }

    /**
     * Initialise the valid commands set
     */
    private static void initValidCommands(){
        validCommands.add("create_parking_lot");
        validCommands.add("park");
        validCommands.add("leave");
        validCommands.add("status");
        validCommands.add("registration_numbers_for_cars_with_colour");
        validCommands.add("slot_numbers_for_cars_with_colour");
        validCommands.add("slot_number_for_registration_number");
    }

    /**
     * Enum representing all commands
     */
    public enum Commands{
        create_parking_lot,
        park,
        leave,
        status,
        registration_numbers_for_cars_with_colour,
        slot_numbers_for_cars_with_colour,
        slot_number_for_registration_number;

        /**
         * Return this respective ordinal value
         * @return the respective ordinal value
         */
        public int getValue(){
            return this.ordinal();
        }
    }
}
