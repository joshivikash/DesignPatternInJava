package design.behavioral.observer;

public interface Observable {
    void add(Observer observer);

    void notifyObservers();
}
