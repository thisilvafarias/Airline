/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

public class Pilot extends Person {
        String license;

    public Pilot(String fname, String lName, String license) {
        super();
        this.fName = fname;
        this.lName = lName;
        this.license = license;
    }   
}
