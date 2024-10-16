package pl.wozrceprojektowe;

public class ObserverImpl implements Observer {

    @Override
    public void updateState(String message) {
        System.out.println(message);
    }
}
