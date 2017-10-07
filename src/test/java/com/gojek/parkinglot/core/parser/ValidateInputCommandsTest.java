package com.gojek.parkinglot.core.parser;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link ValidateInputCommands}
 */
public class ValidateInputCommandsTest {

    /**
     * Test method for {@link ValidateInputCommands#isValidInputCommand(String)}
     */
    @Test
    public void isValidInputCommandTest(){
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("create_parking_lot 6"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("create_parking_lot"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("test"));
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("park a white"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("park a"));
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("leave 6"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("leave"));
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("status"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("status 6"));
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("registration_numbers_for_cars_with_colour white"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("registration_numbers_for_cars_with_colour"));
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("slot_numbers_for_cars_with_colour white"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("slot_numbers_for_cars_with_colour"));
        Assert.assertTrue(ValidateInputCommands.isValidInputCommand("slot_number_for_registration_number a"));
        Assert.assertFalse(ValidateInputCommands.isValidInputCommand("slot_number_for_registration_number"));
    }
}
