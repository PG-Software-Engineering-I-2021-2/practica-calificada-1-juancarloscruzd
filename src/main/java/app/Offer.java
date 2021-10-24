package app;

public class Offer {
    private final String topic;
    private final String season;

    public Offer(String topic, String season) {
        this.topic = topic;
        this.season = season;
    }

    public String getTopic() {
        return topic;
    }

    public String getSeason() {
        return season;
    }
}
