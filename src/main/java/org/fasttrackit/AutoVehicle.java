package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;
    private boolean running;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle(Engine engine, boolean running) {
        this.engine = engine;
        this.running = running;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    // constructor overloading
    public AutoVehicle() {
        this(new Engine());
    }
}
