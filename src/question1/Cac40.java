package question1;

import java.util.ArrayList;
import java.util.List;

public class Cac40  extends Observable{

    private int value;
    private List<Broker> brokers = new ArrayList<>();

    public void add(Broker broker) {
        this.brokers.add(broker);
        setObserverCount(brokers.size());
    }

    public void remove(Broker broker) {
        this.brokers.remove(broker);
        setObserverCount(brokers.size());
    }

    public void setValue(int value) {
        this.value = value;
        for (Broker broker : this.brokers) {
            broker.update();
        }
    }
}
