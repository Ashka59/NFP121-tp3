package question1;

import java.util.ArrayList;
import java.util.List;

public class Cac40  extends Observable{

    private int value;

    public void setValue(int value) {
        this.value = value;
        super.notifyObs();
    }
}
