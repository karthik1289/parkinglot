package com.gojek.parkinglot.core.parser;

import com.gojek.parkinglot.core.interfaces.IExecutor;

import java.io.*;

/**
 * This class will be invoked for shell executor
 */
public class ShellExecutor implements IExecutor {

    private static final String SPACE = " ";

    /**
     * Shell invoker
     */
    public void execute() {
        System.out.println("You are in Interactive command shell. Please enter valid command or" +
            "type exit to quit");
        for (;;) {
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String command = bufferRead.readLine();
                if (command.equalsIgnoreCase("exit")) {
                    break;
                } else if ((command == null) || (command.trim().length() == 0)) {
                    continue;
                } else {
                    executeCommand(command);
                }
            } catch(IOException e) {
                System.out.println("Exception while reading from console");
                e.printStackTrace();
            }
        }
    }

    /**
     * Method to execute the given command
     * @param command which needs to be executed
     */
    public void executeCommand(String command){
        if(ValidateInputCommands.isValidInputCommand(command)){
            String[] input = command.split(SPACE,-1);
            CommandExecutor.executeCommand(input);
        }
        else{
            System.out.println("Entered command is invalid");
        }
        return;
    }
}
