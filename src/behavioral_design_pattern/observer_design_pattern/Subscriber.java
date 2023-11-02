package behavioral_design_pattern.observer_design_pattern;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("New video uploaded to channel for "+this.name);
    }
}
