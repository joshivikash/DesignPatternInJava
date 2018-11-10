package design.behavioral.observer;

public class Subscriber implements Observer {

    private Topic  topic;
    private String id;

    public Subscriber(String id) {
        this.id = id;
    }

    @Override
    public void observe(Observable observable) {
        topic = (Topic) observable;
    }

    @Override
    public void update() {
        System.out.println(id + " NOTIFIED !!! New Topic Added " + topic.getTopics().peek());
    }

}
