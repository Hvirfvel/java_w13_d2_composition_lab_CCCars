package vehicles;

import components.Battery;
import components.Engine;

public class HybridCar extends Vehicle{

    Engine engine;
    Battery battery;

    public HybridCar(int price, String colour) {
        super(price, colour);
        this.engine = engine;
        this.battery = battery;
    }
}
