import components.Battery;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Battery battery;

    @Before
    public void beforeEach() {
        battery = new Battery(10);
        electricCar = new ElectricCar(36000, "Blue", battery);
    }

    @Test
    public void getPrice() {
        assertEquals(36000, electricCar.getPrice());
    }

    @Test
    public void getColour() {
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void getBatteryLifespan() {
        assertEquals(10, electricCar.getBatteryLifespan());
    }
}
