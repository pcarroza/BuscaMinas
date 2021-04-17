package main.java.models;

public class Subject {

    private Observer observer;

    public void register(Observer observer) {
        this.observer = observer;
    }

    public void initialize() {
        this.observer.initialize();
    }

    public void begin() {
        this.observer.begin();
    }

    public void end() {
        this.observer.end();
    }

    public void exit() {
        this.observer.exit();
    }
}
