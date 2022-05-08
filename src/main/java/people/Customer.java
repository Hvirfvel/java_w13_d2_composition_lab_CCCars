package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(int money) {
        this.money = money;
        vehicles = new ArrayList<Vehicle>();
    }
}
