package learning.random;

public class learningThreads {
    public static void main(String[] args) {
        int myNumber;

        myThread thread = new myThread();
        myNumber = thread.getMyNumber();
        System.out.println(myNumber);
        thread.run();
        myNumber = thread.getMyNumber();
        System.out.println(myNumber);

        System.out.println("This code is outside of the thread");
    }

}

/*
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
 */
/*
class myThread implements Runnable {
    private volatile int value;

    @Override
    public void run() {
        value = 2;
    }

    public int getValue() {
        return value;
    }
}

 */



