import components.Battery;
import money.Till;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealership;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Till till;
    Dealership dealership;
    ElectricCar electricCar;
    Battery battery;
    Customer customer;

    @Before
    public void beforeEach() {
        till = new Till(60000);
        dealership = new Dealership("Abby's racing", till);
        electricCar = new ElectricCar(40000, "Silver", battery);
        customer = new Customer(50000);
    }

    @Test
    public void getName() {
        assertEquals("Abby's racing", dealership.getName());
    }

    @Test
    public void getTillBalance() {
        assertEquals(60000, dealership.getTillBalance());
    }

    @Test
    public void getVehicleCount() {
        assertEquals(0, dealership.getVehicleCount());
    }

    @Test
    public void canAddVehicle() {
        dealership.addVehicle(electricCar);
        assertEquals(1, dealership.getVehicleCount());
    }

    @Test
    public void canRemoveVehicle() {
        dealership.addVehicle(electricCar);
        dealership.addVehicle(electricCar);
        dealership.removeVehicle(electricCar);
        assertEquals(1, dealership.getVehicleCount());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(electricCar);
        assertEquals(1, dealership.getVehicleCount());
        assertEquals(20000, dealership.getTillBalance());
    }

    @Test
    public void cannotBuyCarIfNotEnoughBalance() {
        electricCar = new ElectricCar(75000, "White", battery);
        dealership.buyVehicle(electricCar);
        assertEquals(0, dealership.getVehicleCount());
        assertEquals(60000, dealership.getTillBalance());
    }

    @Test
    public void canSellVehicleToCustomer() {
        dealership.buyVehicle(electricCar);
        dealership.sellVehicleToCostumer(electricCar, customer);
        assertEquals(60000, dealership.getTillBalance());
    }
}
