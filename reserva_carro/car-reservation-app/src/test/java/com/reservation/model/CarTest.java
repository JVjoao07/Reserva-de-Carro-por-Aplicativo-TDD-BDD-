import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "ABC-1234", true);
    }

    @Test
    void testCarModel() {
        assertEquals("Toyota", car.getModel());
    }

    @Test
    void testCarLicensePlate() {
        assertEquals("ABC-1234", car.getLicensePlate());
    }

    @Test
    void testCarAvailability() {
        assertTrue(car.isAvailable());
    }

    @Test
    void testCarAvailabilityToggle() {
        car.setAvailable(false);
        assertFalse(car.isAvailable());
    }
}