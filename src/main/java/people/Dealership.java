package people;

import money.Till;
import vehicles.ElectricCar;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private Till till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, Till till) {
        this.name = name;
        this.till = till;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTillBalance() {
        return till.getBalance();
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }


    public void buyVehicle(Vehicle vehicle) {
        if (till.getBalance() > vehicle.getPrice()) {
            till.reduceBalance(vehicle.getPrice());
            addVehicle(vehicle);
        }
    }

    public void sellVehicleToCostumer(Vehicle vehicle, Customer customer) {
        if (vehicle.canSell(customer)) {
            removeVehicle(vehicle);
            till.increaseBalance(vehicle.getPrice());
        }
    }
}
