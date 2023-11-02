package behavioral_design_pattern.observer_design_pattern;

public interface Subject {

        void subscribe(Observer ob);
        void unSubscribe(Observer ob);
        void notifyChanges();
}
