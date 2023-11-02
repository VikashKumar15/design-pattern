package behavioral_design_pattern.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notifyChanges() {
        for (Observer ob: this.subscribers
             ) {
            ob.notified();
        }
    }
}
