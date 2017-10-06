package com.gojek.parkinglot.core;

import com.gojek.parkinglot.core.interfaces.IParkingFunctions;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class represents all parking operations available
 * This is singleton class to give one instance of this
 * @author Karthik
 */
public class ParkingLot implements IParkingFunctions {

    private static volatile ParkingLot parkingLot;

    private static Map<Integer,Car> parkingSlots;

    private static Set<Integer> emptySlot = new TreeSet<Integer>();

    /**
     * Singleton instance of this class
     * @return {@link CreateParkingLot}
     */
    public static synchronized ParkingLot getInstance() {
        if (parkingLot == null) {
            synchronized (ParkingLot.class) {
                if (parkingLot == null) {
                    parkingLot = new ParkingLot();
                    parkingSlots = CreateParkingLot.getInstance().getParkingSlots();
                    initEmptySlots();
                }
            }
        }
        return parkingLot;
    }

    /**
     * Initialise the empty slots
     */
    private static void initEmptySlots(){
        for(int i = 1 ; i <= CreateParkingLot.getInstance().getNumberOfSlots(); i++){
            emptySlot.add(Integer.valueOf(i));
        }
    }

    /**
     * Method to park the car for given registration number and car colour
     * @param registrationNumber of car
     * @param colour of car
     */
    public void parkCar(String registrationNumber, String colour){
        if(emptySlot.size() == 0){
            System.out.println("Sorry, parking lot is full");
        }
        else{
            Integer slot = emptySlot.iterator().next();
            parkingSlots.put(slot, new Car(registrationNumber, colour));
            emptySlot.remove(slot);
        }
    }

    /**
     * Method to leave parking
     * @param slot number which needs to be emptied
     */
    public void leaveParking(Integer slot) {
        if(parkingSlots.containsKey(slot)){
            parkingSlots.remove(slot);
            emptySlot.add(slot);
        }
        else {
            System.out.println("Invalid slot to leave parking");
        }
    }

    /**
     * Returns the current status
     */
    public void getStatus() {
        System.out.println("Slot No.\t\t\tRegistration No\t\t\tColour");
        for(Map.Entry<Integer,Car> entry : parkingSlots.entrySet()){
            System.out.println(entry.getKey()+"\t\t\t"+entry.getValue().getCarNumber()+"\t\t\t"+
            entry.getValue().getColour());
        }
    }

    /**
     * Get all registration number of cars with the given colour
     * @param colour of car
     */
    public void getRegistrationNumberWithColour(String colour) {
        for(Map.Entry<Integer, Car> entry : parkingSlots.entrySet()){
            if(entry.getValue().getColour().equalsIgnoreCase(colour)){
                System.out.print(entry.getValue().getCarNumber()+", ");
            }
        }
    }

    /**
     * Returns the all slot number for given car colour
     * @param colour of the car
     */
    public void getSlotWithColour(String colour) {
        for(Map.Entry<Integer, Car> entry : parkingSlots.entrySet()){
            if(entry.getValue().getColour().equalsIgnoreCase(colour)){
                System.out.print(entry.getKey()+", ");
            }
        }
    }

    /**
     * returns the slot number of the car for given registration number
     * @param registrationNumber of car
     */
    public void getSlotWithRegistrationNumber(String registrationNumber) {
        boolean isRegistrationNumberFound = false;
        for(Map.Entry<Integer, Car> entry : parkingSlots.entrySet()){
            if(entry.getValue().getCarNumber().equalsIgnoreCase(registrationNumber)){
                isRegistrationNumberFound = true;
                System.out.println(entry.getKey());
                break;
            }
        }
        if(!isRegistrationNumberFound){
            System.out.println("Not found");
        }
    }
}
