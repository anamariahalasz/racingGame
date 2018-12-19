package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Engine firstEngine = new Engine();
//        firstEngine.manufacturer = "Renault";
//
//        // declaring a variable and instalating a Car object
//        // this is also called initializing a variable
//       Car firstCompetitor = new Car(firstEngine);
//       firstCompetitor.setName("Dacia");
//       firstCompetitor.setColor("black");
//       firstCompetitor.doorCount = 5;
//       firstCompetitor.setMileage(9.5);
//
//        // local variables are variables declared inside a method
//        // they don`t receive default values
//        Car secondCompetitor = new Car(new Engine());
//        secondCompetitor.setName("Golf");
//
//        // sout prints a message to the console
//        System.out.println(firstEngine.manufacturer);
//
//
//
//       firstCompetitor.engine = firstEngine;
//       firstCompetitor.engine.manufacturer = "BMW";
//
//        System.out.println(firstEngine.manufacturer);
//        System.out.println(firstCompetitor.engine.manufacturer);
//
//        double traveledDistance = firstCompetitor.accelerate(100, 30);
//
        Vehicle vehicle = new Vehicle();
        vehicle.applicationTotalNumberOfVehicles = 1;

        System.out.println("Total from vehicle 1: " + vehicle.applicationTotalNumberOfVehicles);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.applicationTotalNumberOfVehicles = 2;

        System.out.println("Total from vehicle 2: " + vehicle2.applicationTotalNumberOfVehicles);
        System.out.println("Total from vehicle 1: " + vehicle.applicationTotalNumberOfVehicles);





    }
}
