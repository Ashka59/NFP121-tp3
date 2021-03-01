package question2;

import java.util.Observable;

public class Number extends Observable {
    private int value = 0;

    public int getValue() { return value; }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers();
    }
}
