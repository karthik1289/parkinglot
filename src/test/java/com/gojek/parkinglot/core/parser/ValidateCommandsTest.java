package com.gojek.parkinglot.core.parser;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link ValidCommands}
 * @author Karthik
 */
public class ValidateCommandsTest {

    /**
     * Test method for {@link ValidCommands#getValidCommands()}
     */
    @Test
    public void getValidCommandsTest(){
        Assert.assertEquals(ValidCommands.getValidCommands().size(),7);
    }

    @Test
    public void getOrdinalTest(){
        Assert.assertEquals(ValidCommands.Commands.create_parking_lot.getValue(),0);
        Assert.assertEquals(ValidCommands.Commands.park.getValue(),1);
        Assert.assertEquals(ValidCommands.Commands.leave.getValue(),2);
        Assert.assertEquals(ValidCommands.Commands.status.getValue(),3);
        Assert.assertEquals(ValidCommands.Commands.registration_numbers_for_cars_with_colour
            .getValue(),4);
        Assert.assertEquals(ValidCommands.Commands.slot_numbers_for_cars_with_colour
            .getValue(),5);
        Assert.assertEquals(ValidCommands.Commands.slot_number_for_registration_number
            .getValue(),6);
    }
}
