package people;

import money.Till;
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
}
