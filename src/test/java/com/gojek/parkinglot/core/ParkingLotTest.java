package com.gojek.parkinglot.core;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;

/**
 * Test class {@link ParkingLot}
 * @author Karthik
 */
public class ParkingLotTest {

    private static CreateParkingLot parkingLotInstances;
    private static ParkingLot parkingLot;

    @BeforeClass
    public void setUpBeforeClass() throws IOException{
        parkingLotInstances = CreateParkingLot.createParkingLot(6);
        parkingLot = ParkingLot.getInstance();
    }

    /**
     * Test method for {@link ParkingLot#parkCar(String, String)}
     */
    @Test
    public void parkCarTest(){
        parkingLot.parkCar("a","white");
        Assert.assertEquals(parkingLotInstances.getParkingSlots().size(),1);
    }

    /**
     * Test method for {@link ParkingLot#leaveParking(Integer)}
     */
    @Test
    public void leaveParkingTest(){
        parkingLot.leaveParking(1);
        Assert.assertEquals(parkingLotInstances.getParkingSlots().size(),0);
    }
}
