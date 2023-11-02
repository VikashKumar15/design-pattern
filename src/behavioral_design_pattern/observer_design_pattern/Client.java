package behavioral_design_pattern.observer_design_pattern;

public class Client {

    public static void main(String[] args) {

        YouTubeChannel channel1 = new YouTubeChannel();
        Subscriber aman = new Subscriber("aman");
        channel1.subscribe(aman);
        channel1.notifyChanges();
    }
}
