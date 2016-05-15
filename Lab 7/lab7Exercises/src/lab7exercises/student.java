/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7exercises;

/**
 *
 * @author legsl_000
 */
public class student extends person{
    protected String major;
    protected int unitsCompleted;

    public student() {
        super();
        major = "";
        unitsCompleted = 0;
        
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getUnitsCompleted() {
        return unitsCompleted;
    }

    public void setUnitsCompleted(int unitsCompleted) {
        this.unitsCompleted = unitsCompleted;
    }
        public String getInfo(){
        return " Name: " + name + " | Address: " + address + " | Age: " + Integer.toString(age) + " | Major: " + major + " | Units Earned: " + Integer.toString(unitsCompleted);
        
    }
    
    
    
    
    
    
    
}
