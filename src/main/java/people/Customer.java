package people;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(int money) {
        this.money = money;
        vehicles = new ArrayList<Vehicle>();
    }

    public int getMoney() {
        return money;
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        addVehicle(vehicle);
        money -= vehicle.getPrice();
    }
}
