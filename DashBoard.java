/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class DashBoard {
    int option = 0;
    SetUpFlight sf;
    ArrayList<AirPlane> ap;
    ArrayList<Flight> flt;
    Scanner in = new Scanner(System.in);
	    
    DashBoard(ArrayList<Flight> flt, ArrayList<AirPlane> ap){
        this.flt = flt;
        this.ap = ap;
    }
	
    public void optionPanel(){
        Boolean quiltCompletely = true;
        do {  // Loop until we have correct input
            try {      
                do{
                    option = in.nextInt();
                    int opt = 0;
                    int fltNumber;
                    
                    switch (option) {
                        case 1:
                            int flightLeft = 9 - flt.size();
                            System.out.println("You can add " + flightLeft + " more flights");
                            if(flt.size()>=9){
                                System.out.println("You have reached the limit of flights to be added (Max 5)"
                                                   + "\n Enter another option.");
                                break;
                            }else{
                                sf = new SetUpFlight(ap);
                                sf.addNewFlight(flt);
                            }
                            break;

                        case 2:

                            sf = new SetUpFlight();

                            do{
                                System.out.println("Enter the flight number you want to change the Arrival Time.");
                                fltNumber = in.nextInt();
                                boolean found = false;
                                String nat= "";

                            for (Flight s : flt) {

                                if (s.getFlightNumber()==fltNumber){
                                    found = true;
                                    System.out.println("Enter the new arrival time");
                                    nat = in.next(); 
                                    sf.infoForChangingSchedule(fltNumber, nat, flt); 
                                    opt = 0;
                                    break;  
                                    }
                                }

                                if(found==false){ 

                                    System.out.println("Flight number not Found!");
                                    System.out.println("Do you want to search another flight number? "
                                                        + "\n  1 - Yes"
                                                        + "\n  2 - No ");
                                    opt = in.nextInt();
                                }

                                }while(opt == 1); 

                                 if(opt==2){
                                 diplayFlights();
                                 }
                                break;

                        case 3:
                            sf = new SetUpFlight();
                            
                            do{
                            System.out.println("Enter the flight number you want to change the Arrivel and Departure Time.");
                            fltNumber = in.nextInt();
                            boolean found = false;
                            
                            for (Flight s : flt) {
                                
                                if (s.getFlightNumber()==fltNumber){
                                    found = true;
                                    
                                    System.out.println("Enter the new departure time");
                                    String ndTime = in.next();

                                    System.out.println("Enter the new arrival time");
                                    String naTime = in.next();

                            

                                    sf.infoForChangingSchedule(fltNumber, ndTime, naTime , flt);
                                    opt = 0;
                                    break;  
                                    }
                                 }
                                if(found==false){ 

                                    System.out.println("Flight number not Found!");
                                    System.out.println("Do you want to search another flight number? "
                                                        + "\n  1 - Yes"
                                                        + "\n  2 - No ");
                                    opt = in.nextInt();
                                }
                            
                            }while(opt == 1); 

                                 if(opt==2){
                                 diplayFlights();
                                 }
                                break;

                        case 4:

                            System.out.println("Updated display");
                            diplayFlights();

                            break;

                        case 5:

                            option = 5;
                            break;

                        default:

                            do{

                                System.out.println("Invalid entry, try it again.");
                                option = in.nextInt();

                            }while(false);

                        break;

                    } 

                }while (option != 5);

                String quit = "n";
                String q;

            do{

                System.out.println("Are you sure you want to quit?"
                                        + "\n  y - Yes"
                                        + "\n  n - No ");
                q = in.next();
                if(q.equalsIgnoreCase("n")){
                    q = "y";
                    diplayFlights();
                    
                }
            }while(!q.equalsIgnoreCase("y"));
                System.out.println("Thank you for using our Flight Application!");
                quiltCompletely = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid enter: Please enter a number from 1 to 5");
                    in.next();    // discard non-int input
                    continue;     // restart loop, didn't get an integer input
            }
        }while(quiltCompletely);
     }
	
    public void diplayFlights() {
	           
        System.out.println("***********************************************************************************"
                            + "\n***********************************************************************************"
                            + "\n*************************Flight information display system*************************"
                            + "\n***********************************************************************************");
	
        //Print all currently flights
        for (Flight s : flt)
        System.out.println(s);
        System.out.println("\nPress:       1 - To add a new flight           | 2 - Change arrival"
	                       + "\n             3 - Change Arrival and Departure  | 4 - Show all flight        5 - Quit");
	//Call the Main Menu 
        optionPanel();
    }
}  
