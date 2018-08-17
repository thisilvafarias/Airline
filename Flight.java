/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    
    private String origin;
    private String destination;
    String departureTime;
    String arrivalTime;
    String dateOfFlight;
    AirPlane airCraftAssigned;
    int flightNumber;
                
    Scanner in = new Scanner(System.in);
		
    public Flight(String origin, String destination, String departure, String arrivalTime, 
                  String dateOfFight, AirPlane airplaneAssigned, int flightNumber){
        
        super();
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departure;
        this.arrivalTime = arrivalTime;
        this.dateOfFlight = dateOfFight;
        this.airCraftAssigned = airplaneAssigned;
        this.flightNumber = flightNumber;
    }

    //Flight() {
    //}

    Flight(String origin, String destination, String departureTime, String arrivalTime, 
           String dateOfFlight, ArrayList<AirPlane> a, String flightNumber){
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public AirPlane getAirCraftAssigned() {
        return airCraftAssigned;
    }
                           
    public void setAirCraftAssigned(AirPlane airCraftAssigned) {
        this.airCraftAssigned = airCraftAssigned;
    }

    //Adding one for each new flight add
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = 1 + flightNumber;
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }
                
    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public AirPlane airCraftAssigned() {
        return airCraftAssigned;
    }


    @Override
    public String toString() {
                        
        return  "\nFlight Information: "
                + "\nFlight Number: " + flightNumber
                + "\nDate: " + dateOfFlight
                + "\nFrom: " + origin +  " to " + destination
                + "\nFlight time: " + departureTime+  " to " + arrivalTime
                + "\nPlane Information: "
                + "\nAircraft : "+ airCraftAssigned.make + ",  Model = " + airCraftAssigned.model
                + "\nCapacity: "+ airCraftAssigned.capacity +" seats"
                + "\nPilot: " + airCraftAssigned.plt.fName  + " ";
                            	
    }
		
    public void schedule (String arrivalTime){
    
        setArrivalTime(arrivalTime);
        System.out.println("The arrival time was successfully changed. Enter 4 to update the window");
        
                   
    }
		
    public void schedule (String departureTime, String arrivalTime){
    
        setArrivalTime(arrivalTime);
        setDepartureTime(departureTime);
        System.out.println("The arrival and departure time were successfully changed. Enter 4 to update the window");
                   
    }	
}

