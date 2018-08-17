# Airline

# Module Title:

# Object Oriented Constructs

## Project Title:

## Airline

```
Assignment Compiler:
Mark Morrissey
Giliane de Lima Braga 2016129
Jacqueline Siqueira de Medeiros 2016273
Thiago Silva Farias 2016182
CCT DUBLIN 2018
```

- Introduction
- Overview Classes
- 1 Add a new Flight
   - 1.1 Scenario (Case 1)
- 2 Change arrival
   - 2.1 Scenario (Case 2 - Flight found)
   - 2.2 Scenario (Case 2 - Flight not found, so user try another number)
   - 2.3 Scenario (Case 2 - Flight not found, so user choices to leave menu)
- 3 Change Arrival and Departure
   - 3.1 Scenario (Case - 3 - Flight found)
   - 3.2 Scenario (Case - 3 - Flight not found, so user try another number)
   - 3.3 Scenario (Case 2 - Flight not found, so user leaves menu)
- 4 Show all flight
   - 4. 1 Scenario (Case 4)
- 5 Quit
   - 5.1 Scenario (Case 5 - User confirm to quit)
   - 5.2 Scenario (Case 5 - User doesn’t confirm to quit)


## Introduction

This report will present an overall of our project AIrline.
The definition of classes, functions and possible scenarios for the program while it is
executed by an user.
To get this report done, we had few meetings, most of it online, where we discussed what
classes would be needed for the project and how we could develop them in the best way
possible.
We hope that all the effort have worth it!


## Overview Classes

**package model
Airplane methods**
public AirPlane();
public AirPlane(String make, String model, int capacity);
public String getMake();
public void setMake(String make);
public String getModel();
public void setModel(String model);
public int getCapacity();
public void setCapacity(int capacity);
public void assignPilot(Pilot plt);
public String toString();
**Aircraft methods**
public void assignPilot(Pilot plt);
**Flight methods**
public Flight(String origin, String destination, String departure, String arrivalTime,
String dateOfFight, AirPlane airplaneAssigned, int flightNumber)
Flight(String origin, String destination, String departureTime, String arrivalTime,
String dateOfFlight, ArrayList<AirPlane> a, String flightNumber)
public void setArrivalTime(String arrivalTime);
public void setDepartureTime(String departureTime);
public void setOrigin(String origin);
public void setDestination(String destination);
public void setDateOfFlight(String dateOfFlight);
public AirPlane getAirCraftAssigned();
public void setAirCraftAssigned(AirPlane airCraftAssigned);
public void setFlightNumber(int flightNumber);
public int getFlightNumber();
public String getOrigin();
public String getDestination();
public String getDepartureTime();
public String getArrivalTime();
public String getDateOfFlight();
public AirPlane airCraftAssigned(); /*
@Override
public String toString();
public void schedule(String arrivalTime);
public void schedule(String departureTime, String arrivalTime);


**Person methods**
Abstract class, no method on it
**Pilot methods**
public Pilot(String fname, String lName, String license);
**airline.main**
CCTAir (main method)
**airline.factory
DashBoard methods**
public DashBoard(ArrayList<Flight> flt, ArrayList<AirPlane> ap);
public void displayFlights();
**SetUpFlight methods**
public SetUpFlight();
public SetUpFlight(ArrayList<AirPlane> ap);
public void infoForChangingSchedule(int flightNumber, String nat, ArrayList<Flight> flt);
public void infoForChangingSchedule(int flightNumber, String ndt, String nat,
ArrayList<Flight> flt);
public void addNewFlight(ArrayList<Flight> flt);


**Scenarios of typical user**

## 1 Add a new Flight

### 1.1 Scenario (Case 1)

The user will open the program.
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type “1” and hits enter
A message appears “Please, enter the flight origin”
User type origin “Dublin” and hits enter
A message appears “Please, enter the flight destination?”
User type destination “Rome” and hit enter
A message appears “Please, enter the departure time”
User type departure time “12:00” and hits enter
A message appears “Please, enter the arrival time”
User type departure time “16:00” and hits enter
A message appears “Please, enter the date of the flight”
User type date of the flight “31/03/2018” and hits enter
A message appear “What type of AirPlane do you want for your Flight(Enter the number)?”
1 - BOEING
2 - AIRBUS
3 - EMBRAER
4 - BOMBARDIER
User type one of them and hits enter
The screen will display the FlightList information with the new flight added and a menu with
the five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit

## 2 Change arrival

### 2.1 Scenario (Case 2 - Flight found)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type “2” and hits enter


A message appears “Enter the flight number you want to change the Arrival Time”
User type an existent FlightNumber Ex. “1”
A message appears “Enter the new arrival time”
User type new arrival time, for example 12:12, and hits enter
A message appears “The arrival time was successfully changed. Enter 4 to update the
window!”
User type 4 and hits enter
The screen will display the FlightList information with the update of the flight arrival time and
a menu with the five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit

### 2.2 Scenario (Case 2 - Flight not found, so user try another number)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type “2” and hit enter
A message appears “Enter the flight number you want to change the Arrival Time”
User type an inexistent FlightNumber Ex. “5”
A message appears “Flight number not Found! Do you want to search another flight
number?”
1 - Yes
2 - No
User type “1” and hits enter
A message appears “Enter the new arrival time”
User type new arrival time “12:12” and hit enter
A message appears “The arrival time was successfully changed. Enter 4 to update the
window
The screen will display the FlightList information with the update of the flight arrival time and
a menu with the five options:

1. Add a new Flight 2. Change Flight arrival 3. Change Arrival and Departure 4. Show
    all flight 5. Quit

### 2.3 Scenario (Case 2 - Flight not found, so user choices to leave menu)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit


User type “2” and hit enter
A message appears “Enter the flight number you want to change the Arrival Time”
User type an ​inexistent​ FlightNumber Ex. “5”
A message appears “Flight number not Found! Do you want to search another flight
number?”
1 - Yes
2 - No
User type “2” and hits enter
The screen will display the FlightList information with the update of the flight arrival time and
a menu with the five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit

## 3 Change Arrival and Departure

### 3.1 Scenario (Case - 3 - Flight found)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type 3 and hit enter
A message appears “Enter the flight number you want to change the Arrival and Departure
Time.”
User type an existent FlightNumber “3”
A message appears “Enter the new departure time”
User type new arrival time “12:12” and hit enter
A message appears “Enter the new arrival time”
User type new arrival time “15:15” and hit enter
A message appears
User type 4 and hits enter
The screen will display the FlightList information with the update of the flight arrival time,
departure time and a menu with the five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit

### 3.2 Scenario (Case - 3 - Flight not found, so user try another number)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit


User type “3” and hit enter
A message appears “Enter the flight number you want to change the Arrival and Departure
Time.”
User type an ​inexistent​ FlightNumber “5”
A message appears “Flight number not Found! Do you want to search another flight
number?”
1 - Yes
2 - No
User type “1” and hits enter
A message appears “Enter the flight number you want to change the Arrival and Departure
Time.”

### 3.3 Scenario (Case 2 - Flight not found, so user leaves menu)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type “3” and hit enter
A message appears “Enter the flight number you want to change the Arrival and Departure
Time.”
User type an ​inexistent​ FlightNumber “5”
User type an existent FlightNumber “3”
A message appears “Enter the new departure time”
User type new arrival time “12:12” and hit enter
A message appears “Enter the new arrival time”
User type new arrival time “15:15” and hit enter
A message appears
User type 4 and hits enter
The screen will display the FlightList information with the update of the flight arrival time,
departure time and a menu with the five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit

## 4 Show all flight

### 4. 1 Scenario (Case 4)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival


3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type 4 and hit enter
The screen will display the FlightList information and a menu with the five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit

## 5 Quit

### 5.1 Scenario (Case 5 - User confirm to quit)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type “5” and hit enter
A message appears “Are you sure you want to quit?” with the options
y - Yes
n - No
User type “y” and hits enter
A message appears “Thank you for using our Flight Application!”

### 5.2 Scenario (Case 5 - User doesn’t confirm to quit)

The user will open the program
The screen will display the FlightList information and a menu with five options:
1 - To add a new flight | 2 - Change arrival
3 - Change Arrival and Departure | 4 - Show all flight 5 - Quit
User type “5” and hit enter
A message appears “Are you sure you want to quit?” with the options
y - Yes
n - No


**Design choices**
Analyzing the possible scenarios was possible to identify several requirements for the
system.
We would need a ​ **list of Flights** ​, but before having a list we had to define the characteristics
of one flight at least, then we created a class ​ **Flight** ​.
We would need ​ **AirplaneList** ​, same as Flight, before having a list we had to have a
definition of what the ​ **Airplane** ​should/could have.
Although there is no option for the user to manipulate Pilots informations, we assume a Pilot
will be required, finally, who will fly the Airplane? To make sure no Flight will be created
without a ​ **Pilot,** ​ ​ **Airplane** ​ should have an​ ​Interface with a method to assign pilot.
Messages, screen displays. We identified we would need lots of messages being printed on
the screen. So would make sense to have a class to produce those messages along the
program ​ **DashBoard** ​.
Create a Flight would also be a repetitive action, so you needed a way to produce it
**setUpFlight.**
In this scenario we could identify some of the requirements for the system.
We would need a ​ **list of Flights** ​, but before having a list we had to define the characteristics
of one flight at least, then we created a class ​ **Flight** ​.
We would need ​ **AirplaneList** ​, same as Flight, before having a list we had to have a
definition of what the ​ **Airplane** ​should/could have.
Although the there is no option to the user to manipulate Pilots informations, we assume a
Pilot will be required, finally, who will pilot the Airplane? To make sure no Flight will be
created without a ​ **Pilot,** ​ ​ **Airplane** ​ should have an​ ​Interface with a method to assign pilot.
Messages, screen displays. We identified we would need lots of messages being printed on
the screen. So would make sense to have a class to produce those messages along the
program ​ **DashBoard** ​.
Create a Flight would also be a repetitive action, so you needed a way to produce it
**setUpFlight.**
To facilitate the development, we set most of the variables as String Type. It is because it
would be easier to manage the inputs of users without to much troubles. However, this is
something to be improved in a future version of this system.
Finally, after walking through the processes we defined the classes required for this project.


