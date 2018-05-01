import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop(){
        this.queue = new ArrayList<>();
    }

    public int getQueueCount() {
        return this.queue.size();
    }

    public void addPassenger(Person person) {
        this.queue.add(person);
    }

    public Person removePassenger() {
        return this.queue.remove(0);
    }
}
