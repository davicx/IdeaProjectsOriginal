package learning;

public class myThread implements Runnable {
    private volatile int myNumber = 0;

    public void run() {
        System.out.println("This code is running in a thread");
        myNumber = 7;
    }

    public int getMyNumber() {
        return myNumber;
    }

}

/*
public class Countdown implements Runnable{
    private final Thread t;

    public Countdown(){
        t = new Thread(this);
        t.start();
    }

    public Thread.State getState() {
        return t.getState();
    }
    // ...
}
 */
