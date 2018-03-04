package design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Topic implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private Stack<String>  topics    = new Stack<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
        observer.observer(this);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Stack<String> getTopics() {
        return topics;
    }

    public void addNewArticle(String articleTitle) {
        topics.add(articleTitle);
        notifyObservers();
    }

}
