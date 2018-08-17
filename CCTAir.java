package factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import java.util.ArrayList;

/**
 *
 * @author macbookair
 */

public class CCTAir {

    public static void main(String[] args) {
		
     //Instanciate Pilots class
    Pilot p1 = new Pilot("Thiago","Farias","b");
    Pilot p2 = new Pilot("Jacqueline","Medeiros","b");
    Pilot p3 = new Pilot("Giliane"," ","b");
    Pilot p4 = new Pilot("Michael","Collins ","b");
                
    //Instanciate AirPlane class
    AirPlane ap1 = new AirPlane("AIRBUS", "A320", 174);
    AirPlane ap2 = new AirPlane("BOEING", "747-400", 393);
    AirPlane ap3 = new AirPlane("EMBRAER", "E190", 114);
    AirPlane ap4 = new AirPlane("EMBRAER", "A300", 254);
               
    //Assing Pilot into an Aircraft
    ap1.assignPilot(p1);
    ap2.assignPilot(p2);
    ap3.assignPilot(p3);
    ap4.assignPilot(p4);
                
    //Creating an arraylist for the AirPlanes
    ArrayList<AirPlane> ap = new ArrayList<>();
                
    //Adding Airplanes into the aArraysList ap
    ap.add(ap1);
    ap.add(ap2);
    ap.add(ap3);
    ap.add(ap4);
                
    //Creating an arraylist for the flights 
    ArrayList<Flight> flt = new ArrayList<>();
               
    //Instanciate Flight class
    Flight f1 = new Flight("Dublin","Paris","10:10","12:40","26/03/2018", ap1, 1);
    Flight f2 = new Flight("Lisbon","Sao Paulo","08:00","21:00","27/03/2018", ap2, 2); 
    Flight f3 = new Flight("Barcelona","London","18:40","20:10","29/03/2018", ap3, 3);
    Flight f4 = new Flight("Berlin","Rome","21:00","23:00","01/04/2018", ap4, 4);
               
    //Adding Flights into the ArraysList ap
    flt.add(f1);
    flt.add(f2);
    flt.add(f3);
    flt.add(f4);
               
    //Pass as paramenter all flights (flt)
    DashBoard dsb = new DashBoard(flt,ap);
    SetUpFlight sf = new SetUpFlight();
     
    //Start Application
    dsb.diplayFlights();
           
    }
}



