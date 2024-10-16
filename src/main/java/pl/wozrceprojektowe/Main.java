package pl.wozrceprojektowe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Observer exampleObserver = new ObserverImpl();
        Subject subject = new Subject();
        subject.addObserver(exampleObserver);

        Thread countingThread = new Thread(subject::countAndNotify);
        countingThread.start();

        Thread waitingForKeyThread = new Thread(() -> {
            Scanner sc = new Scanner(System.in);

            while (true) {
                if (sc.hasNext()) {
                    subject.cancelTask();
                    System.out.println("Operation cancelled by user");
                    break;
                }
            }
        });
        waitingForKeyThread.start();

    }
}