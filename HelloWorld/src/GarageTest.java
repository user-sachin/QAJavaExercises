import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {


    @Test
    public void testGarage() {
        Garage garage = new Garage(); // MyClass is tested
        // assert statements
        assertEquals("add veichle", 14, garage.addVehicle(new Car(12, "bmw", "car", 14)));
        assertEquals("remove veichle by id", 14, garage.removeVehicleById(14));
        assertEquals("remove veichle by type", 2, garage.removeVehicleByType("car"));
    }

}