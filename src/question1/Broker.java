package question1;

public class Broker implements Observer {
    private boolean change;

    @Override
    public void update() { this.change = true; }

    public boolean isChangeDetected() {
        if (this.change){
            this.change = false;
            return true;
        }
        else{ return false; }
    }
}
