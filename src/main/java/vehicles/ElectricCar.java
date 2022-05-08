package vehicles;

import components.Battery;

public class ElectricCar extends Vehicle {

    Battery battery;

    public ElectricCar(int price, String colour) {
        super(price, colour);
        this.battery = battery;
    }
}
