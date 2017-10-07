package com.gojek.parkinglot.core;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link CreateParkingLot}
 * @author Karthik
 */
public class CreateParkingLotTest {

    /**
     * Test method for {@link CreateParkingLot#getInstance()}
     */
    @Test
    public void testGetInstanceNegativeTest() {
        Assert.assertNotNull(CreateParkingLot.getInstance());
    }

    /**
     * Test method for {@link CreateParkingLot#createParkingLot(Integer)}
     */
    @Test
    public void testCreateParkingLotTest() {
        CreateParkingLot instance = CreateParkingLot.createParkingLot(6);
        Assert.assertNotNull(instance);
        Assert.assertEquals(instance, CreateParkingLot.getInstance());
    }
}
