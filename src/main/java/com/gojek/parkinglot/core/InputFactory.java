package com.gojek.parkinglot.core;

import com.gojek.parkinglot.core.interfaces.IExecutor;
import com.gojek.parkinglot.core.parser.FileExecutor;
import com.gojek.parkinglot.core.parser.ShellExecutor;

/**
 * Factory class to represent the given input types
 * @author Karthik
 */
public class InputFactory {

    public static IExecutor getExecutor(String[] args){
        switch (args.length){
            case 0 : {
                return new ShellExecutor();
            }
            case 1 : {
                return new FileExecutor(args[0]);
            }
            default: System.out.println("Invalid input types. should be either 0 for shell invoker" +
                "or 1 for file invoker");
        }
        return null;
    }
}
