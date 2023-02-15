/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testVehicle;

/**
 *
 * @author نواف الحربي
 */
public class car {
    public  static class Car implements vehicle.Vehicle {
     String model;
     int speed;
     int gear;
     
     @Override
    
    public void changeGear(int newGear) {
       if (newGear<=5)
          gear = newGear;
       else
           gear = 5;
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void speedUp(int increment) {
         speed = speed + increment; 
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;  
    }
    public void printStates() {
        System.out.println("Car model "+ model + " speed: " + speed + " gear: " + gear);
    }
    
}
}
