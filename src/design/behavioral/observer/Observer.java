package design.behavioral.observer;

public interface Observer {
    void update();

    void observe(Observable observable);
}
