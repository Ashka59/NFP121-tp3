package question2;

public class Controller {

    private Number number;
    private View view;

    public Controller(Number n, View v) {
        number = n;
        view = v;
    }

    public void display() {
        view.getjButton1().addActionListener(e -> add());
        view.getjButton2().addActionListener(e -> remove());
        view.getjTextField().addActionListener(e -> update());
    }

    private void add() { number.setValue(number.getValue()+1); }
    private void remove() { number.setValue(number.getValue()-1); }
    //need to press enter before "+" or "-"
    private void update() { number.setValue(Integer.parseInt(view.getjTextField().getText())); }
    //TEST GLOBAL GUI
    public static void main(String[] args) {
        Number number = new Number();
        View view = new View(number);
        Controller controller = new Controller(number, view);
        controller.display();
    }
}
