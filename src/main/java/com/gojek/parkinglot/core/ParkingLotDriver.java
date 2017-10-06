package com.gojek.parkinglot.core;

import com.gojek.parkinglot.core.parser.CommandExecutor;
import com.gojek.parkinglot.core.parser.ValidateInputCommands;
import com.gojek.parkinglot.core.utils.StringUtils;

import java.io.*;

/**
 * Driver class for Parking Lot
 * @author Karthik
 */
public class ParkingLotDriver {

    private static String filePath;

    private static final String SPACE = " ";

    /**
     * Driver method to parse input from command line and execute the respective functions
     * @param args where args[0] will be input file path. If args is empty then interactive command
     *             shell will be invoked
     */
    public static void main(String[] args){
        switch (args.length){
            case 0 : {
                System.out.println("Interactive command shell will be invoked");
                invokeInteractiveShell();
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

    /**
     * Method to run interactive shell
     */
    public static void invokeInteractiveShell(){
        System.out.println("Please enter exit to quit");
        for (;;) {
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String command = bufferRead.readLine();
                if (command.equalsIgnoreCase("exit")) {
                    break;
                } else if ((command == null) || (command.trim().length() == 0)) {
                } else {
                    if(ValidateInputCommands.isValidInputCommand(command)){
                        String[] input = command.split(SPACE,-1);
                        CommandExecutor.executeCommand(input);
                    }
                }
            } catch(IOException e) {
                System.out.println("Exception while reading from console");
                e.printStackTrace();
            }
        }

    }
}
