package question1;


import java.util.ArrayList;
import java.util.List;

public abstract class Observable {


    private int observerCount;
    private List<Broker> brokers = new ArrayList<>();

    public int getObserverCount() { return observerCount; }
    public void setObserverCount(int observerCount) { this.observerCount = observerCount; }

    public List<Broker> getBrokers() { return brokers; }

    public void add(Broker broker) {
        this.brokers.add(broker);
        setObserverCount(brokers.size());
    }

    public void remove(Broker broker) {
        this.brokers.remove(broker);
        setObserverCount(brokers.size());
    }

    public void notifyObs(){
        for (Observer o: this.brokers) {
            o.update();
        }
    }
}
