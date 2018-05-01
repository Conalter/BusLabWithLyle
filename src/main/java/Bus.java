import java.util.ArrayList;

public class Bus {

    private String destination;
    private ArrayList<Person> seat;

    public Bus(String destination) {
        this.destination = destination;
        this.seat = new ArrayList<>();
    }

    public int getPersonCount() {
        return this.seat.size();
    }


    public void addPassenger(Person person) {
        this.seat.add(person);
    }

    public void alightPassenger(Person person) {
        this.seat.remove(person);
    }

    public void getPassengerFromBusStop(BusStop busStop){
        Person personResult = busStop.removePassenger();
        addPassenger(personResult);
    }
}
