/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import java.util.ArrayList;
import java.util.Scanner;

public class SetUpFlight{
	
    Scanner in = new Scanner(System.in);
    ArrayList<AirPlane> ap;
    AirPlane ap1;
    AirPlane ap2;
    AirPlane ap3;
    AirPlane ap4;
    DashBoard dsb;
    
    SetUpFlight(){
    }

    public SetUpFlight(ArrayList<AirPlane> ap){
        this.ap = ap;
    }

     
    public void infoForChangingSchedule(int flightNumber, String nat, ArrayList<Flight> flt){
        
        for (Flight s : flt) {
            if (s.getFlightNumber()==flightNumber){
                s.schedule(nat);
            }
        }
    }
    
    public void  infoForChangingSchedule(int flightNumber, String ndt, String nat, ArrayList<Flight> flt){
        
        for (Flight s : flt) {
            if (s.getFlightNumber()==flightNumber){
            s.schedule(ndt,nat);
            }
        }
    }

    public void addNewFlight(ArrayList<Flight> flt){
    
        String origin = null;
        String destination = null;
        String departureTime = null;
        String arrivalTime = null;
        String dateOfFlight = null;
        AirPlane airCraftSelected = new AirPlane();

        int flightNumber = 0;
        
        /* 
        gets the object airplane and its values from array list ap. declared 
        in the method setupflight above and assign to new variable **/
        
        ap1 = ap.get(0);
        ap2 = ap.get(1);
        ap3 = ap.get(2);
        ap4 = ap.get(3);
        
               
        /*Add up to 5 new flights
        **/
        
        Flight newFlight = new Flight(origin, destination, departureTime, arrivalTime, 
                           dateOfFlight, airCraftSelected , flightNumber);

        System.out.println("Please, enter the flight origin");
        String addingOringin = in.next();
        newFlight.setOrigin(addingOringin);

        System.out.println("Please, enter the flight destination?");
        String addingDestination = in.next();
        newFlight.setDestination(addingDestination);

        System.out.println("Please, enter the departure time");
        String addingDepartureTime = in.next();
        newFlight.setDepartureTime(addingDepartureTime);

        System.out.println("Please, enter the arrival time");
        String addingArrivalTime = in.next();
        newFlight.setArrivalTime(addingArrivalTime);

        System.out.println("Please, enter the date of the flight");
        String addingDateOfFlight = in.next();
        newFlight.setDateOfFlight(addingDateOfFlight);
        
        System.out.println("What type of AirPlane do you want for your Flight(Enter the number)?"
                            + "\n 1 - BOEING "
                            + "\n 2 - AIRBUS "
                            + "\n 3 - EMBRAER "
                            + "\n 4 - BOMBARDIER ");

        int airCraft;
        airCraft = in.nextInt();

        switch (airCraft){
            
            case 1:
            airCraftSelected = ap1;
            break;
            
            case 2:
            airCraftSelected = ap2;        
            break;
            
            case 3:
            airCraftSelected = ap3;       
            break;
            
            case 4:
            airCraftSelected = ap4;    
            break;

            default:
            throw new AssertionError();
        }

        //Passing the amount of flight the registered as a parameter
        newFlight.setFlightNumber(flt.size());
        newFlight.setAirCraftAssigned(airCraftSelected);

        flt.add(newFlight);
        
        dsb = new DashBoard(flt,ap);
        
        dsb.diplayFlights();
   
    }
}

