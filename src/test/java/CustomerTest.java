import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;

    @Before
    public void beforeEach() {
        customer = new Customer(50000);
        car = new Car(32000, "Blue", engine);
    }

    @Test
    public void canGetMoney() {
        assertEquals(50000, customer.getMoney());
    }

    @Test
    public void canGetVehicleCount() {
        assertEquals(0, customer.getVehicleCount());
    }

    @Test
    public void canAddCar() {
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicleCount());
    }

    @Test
    public void canBuyCar() {
        customer.buyVehicle(car);
        assertEquals(1, customer.getVehicleCount());
        assertEquals(18000, customer.getMoney());
    }
}
