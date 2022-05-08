package vehicles;

import components.Engine;

public class Car extends Vehicle{

    Engine engine;

    public Car(int price, String colour, Engine engine) {
        super(price, colour);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getEngineCylinders() {
        return engine.getCylinders();
    }
}
