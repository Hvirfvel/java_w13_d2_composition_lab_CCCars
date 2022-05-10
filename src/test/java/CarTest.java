import components.Engine;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Car car;

    @Before
    public void beforeEach() {
        engine = new Engine(6);
        car = new Car(1750, "Spacegrey", engine);
    }

    @Test
    public void getPrice() {
        assertEquals(1750, car.getPrice());
    }

    @Test
    public void getColour() {
        assertEquals("Spacegrey", car.getColour());
    }

    @Test
    public void getEngineCylinders() {
        assertEquals(6, car.getEngineCylinders());
    }

    @Test
    public void canDamageCar() {
        car.addDamage(500);
        assertEquals(1250, car.getPrice());
    }
}
