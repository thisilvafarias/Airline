/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

public class AirPlane implements Aircraft{
    String make;
    String model;
    Pilot plt;
    int capacity;
	
    public AirPlane(){
    }

    public AirPlane(String make, String model, int capacity) {
        super();
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }
        
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void assignPilot(Pilot plt){
        this.plt = plt;
    }

    @Override
    public String toString() {
                     
        return "Airplane Information: "
                + "\nAircraft : "+ this.make + ",  Model = " + this.model
                + "\nCapacity: "+ this.capacity +" seats"
                + "\nPilot: " + plt.fName+ " " +  plt.lName
                + "\nPilot: " + plt.fName + " ";
    }

    //void add(AirPlane ap1) {
    //}
	
}

