package vehicles;

import components.Battery;
import components.Engine;

public class HybridCar extends Vehicle{

    Engine engine;
    Battery battery;

    public HybridCar(int price, String colour, Engine engine, Battery battery) {
        super(price, colour);
        this.engine = engine;
        this.battery = battery;
    }

    public int getEngineCylinders() {
        return engine.getCylinders();
    }

    public int getBatteryLifespan() {
        return battery.getLifespan();
    }
}
