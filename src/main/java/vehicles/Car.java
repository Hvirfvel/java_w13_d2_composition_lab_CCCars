package vehicles;

import components.Engine;

public class Car extends Vehicle{

    Engine engine;

    public Car(int price, String colour) {
        super(price, colour);
        this.engine = engine;
    }
}
