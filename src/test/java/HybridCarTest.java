import components.Battery;
import components.Engine;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    Engine engine;
    Battery battery;
    HybridCar hybridCar;

    @Before
    public void beforeEach() {
        engine = new Engine(6);
        battery = new Battery(8);
        hybridCar = new HybridCar(40000, "Black", engine, battery);
    }

    @Test
    public void getPrice() {
        assertEquals(40000, hybridCar.getPrice());
    }

    @Test
    public void getColour() {
        assertEquals("Black", hybridCar.getColour());
    }

    @Test
    public void getEngineCylinders() {
        assertEquals(6, hybridCar.getEngineCylinders());
    }

    @Test
    public void getBatteryLifespan() {
        assertEquals(8, hybridCar.getBatteryLifespan());
    }
}
