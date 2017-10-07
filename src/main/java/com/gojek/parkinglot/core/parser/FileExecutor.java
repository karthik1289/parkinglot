package com.gojek.parkinglot.core.parser;

import com.gojek.parkinglot.core.interfaces.IExecutor;

import java.io.*;

/**
 * This class will be invoked for file executor
 * @author Karthik
 */
public class FileExecutor implements IExecutor{

    private String filePath;

    private static final String SPACE = " ";

    /**
     * Constructor initializes the file path
     * @param filePath
     */
    public FileExecutor(String filePath){
        this.filePath = filePath;
    }

    /**
     * File executor
     */
    public void execute() {
        File commandsFile = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(commandsFile));
            String command;
            try {
                while ((command = br.readLine()) != null) {
                    executeCommand(command);
                }
            } catch (IOException ex) {
                System.out.println("Error in reading the input file.");
                ex.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found in the path specified.");
            e.printStackTrace();
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
