package pl.wozrceprojektowe;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private boolean stopFlag = false;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) { // Dodaj metodę usuwania obserwatora
        observers.remove(observer);
    }

    public void notifyAllObservers(String messagee) {
        for (Observer observer : observers) {
            observer.updateState(messagee);
        }
    }

    public void cancelTask() {
        this.stopFlag = true;
    }

    public void countAndNotify()  {
        for (int i = 1; i <= 100; i++) {
            if (stopFlag) {
                notifyAllObservers("Task cancelled!");
                return;
            }
            System.out.println(i);
            try {
                Thread.sleep(100); //
            } catch (InterruptedException e) {
                notifyAllObservers("Exception" + e.getMessage());
            }
        }

        notifyAllObservers("End of task!");
    }

}
