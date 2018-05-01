import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop();
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void canGetPassengerOnBus(){
        busStop.addPassenger(person);
        Person passenger = busStop.removePassenger();
        assertNotNull(passenger);
    }
}
