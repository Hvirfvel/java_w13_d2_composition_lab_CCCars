package vehicles;

import people.Customer;

public abstract class Vehicle {

    private int price;
    private String colour;


    public Vehicle(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public boolean canSell(Customer customer) {
        if (customer.getMoney() >= price) {
            return true;
        }
        return false;
    }
}
