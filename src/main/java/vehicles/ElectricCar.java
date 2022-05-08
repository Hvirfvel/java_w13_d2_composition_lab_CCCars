package vehicles;

import components.Battery;

public class ElectricCar extends Vehicle {

    Battery battery;

    public ElectricCar(int price, String colour, Battery battery) {
        super(price, colour);
        this.battery = battery;
    }

    public int getBatteryLifespan() {
        return battery.getLifespan();
    }
}
