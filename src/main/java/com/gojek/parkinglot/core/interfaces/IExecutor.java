package com.gojek.parkinglot.core.interfaces;

/**
 * Interface for any input format.
 * For this base, file and shell invokers will implement this
 * @author Karthik
 */
public interface IExecutor {

    /**
     * Executes the given command
     * @param command which needs to be executed
     */
    void executeCommand(String command);

    /**
     * Execute via any input types
     */
    void execute();
}
