package vehicles;

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
}
