//package org.fasttrackit;
//
//// inheritance or "is-a" relationship
//public class Car extends AutoVehicle {
//
//    // instance variables (declared as properties of a class)
//    // they receive default values (null for objects, 0 for numbers, false for booleans)
//
//    private int doorCount;
//
//    public Car(Engine engine) {
//        super(engine);
//    }
//
//    public Car(Engine engine, int doorCount) {
//        super(engine);
//        this.doorCount = doorCount;
//    }
//
//    public int getDoorCount() {
//        return doorCount;
//    }
//
//    public void setDoorCount(int doorCount) {
//        this.doorCount = doorCount;
//    }
//}
package org.fasttrackit;

// inheritance or "is-a" relationship
public class Car extends AutoVehicle {

    // instance variables (declared as properties of a class)
    // they receive default values (null for objects, 0 for numbers,
    // false for booleans)

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
}
