/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testVehicle;

import java.util.Scanner;

/**
 *
 * @author نواف الحربي
 */
public class testvehicle {
    public static void main(String[] args) {
       
     
       
        
        Scanner S = new Scanner(System.in); 
        System.out.println("-----Main menu------");
        System.out.println("Choose the type of vehicle you want:");
        System.out.println("1-Bicycle");
        System.out.println("2-Bike");
        System.out.println("3-car");
        System.out.println("Enter the number of your choice:");
         
        int choiceNumber=S.nextInt();
          
        switch(choiceNumber){
         
            case 1:
        Bicycle.bicycle bicycle = new Bicycle.bicycle();
        System.out.println("Enter information about Bicycle: ");
        System.out.println("Enter gear for bicycle:");
        int Gear1 = S.nextInt();  
        bicycle.changeGear(Gear1);
        System.out.println("Enter speedUp for bicycle: ");
        int speedUp1 = S.nextInt(); 
        bicycle.speedUp(speedUp1);
        System.out.println("Enter applyBrakes for applyBrakes: ");
        int applyBrakes1 = S.nextInt(); 
        bicycle.applyBrakes(applyBrakes1);
          System.out.println("-----------------------------");
        System.out.println("Bicycle present state :");
        bicycle.printStates();
            break;
            
          case 2:  
        Bike.bike bike = new Bike.bike();
        System.out.println("-----------------------------");
        System.out.println("Enter information about Bike: ");
        System.out.println("Enter gear for bike:");
        int Gear2 = S.nextInt(); 
        bike.changeGear(Gear2);
        System.out.println("Enter speedUp for bike: ");
        int speedUp2 = S.nextInt(); 
        bike.speedUp( speedUp2);
        System.out.println("Enter applyBrakes for bike: ");
        int applyBrakes2 = S.nextInt(); 
        bike.applyBrakes(applyBrakes2);
        System.out.println("-----------------------------");
        System.out.println("Bike present state :");
        bike.printStates();
           break;
        case 3:
        car.Car  c = new car.Car();
        System.out.println("-----------------------------");
        System.out.println("Enter information about Car: ");
        System.out.println("Enter gear for car:");
        int Gear3 = S.nextInt(); 
        c.changeGear(Gear3);
        System.out.println("Enter speedUp for car: ");
       int speedUp3 = S.nextInt(); 
        c.speedUp(speedUp3);
        System.out.println("Enter applyBrakes for car: ");
        int applyBrakes3 = S.nextInt(); 
        c.applyBrakes(applyBrakes3);
        System.out.println("Enter Model for car: ");
        String Model = S.next();
        c.setModel(Model);
          System.out.println("-----------------------------");
        System.out.println("Car present state :");
        c.printStates();
                
             break;
                
        }
    }
    
}
