import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus testBus;
    Person person;

    @Before
    public void before(){
        testBus = new Bus("Timbuktoo");
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, testBus.getPersonCount());
    }

    @Test
    public void busGetsPassenger(){
        testBus.addPassenger(person);
        assertEquals(1, testBus.getPersonCount());
    }

    @Test
    public void passengerAlightsBus(){
        testBus.addPassenger(person);
        testBus.addPassenger(person);
        testBus.alightPassenger(person);
        assertEquals(1, testBus.getPersonCount());
    }
}
