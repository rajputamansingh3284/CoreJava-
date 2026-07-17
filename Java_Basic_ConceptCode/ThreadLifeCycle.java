class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is in RUNNING state.");
        try {
            System.out.println("Thread is in TIMED_WAITING state (sleeping)...");
            Thread.sleep(2000); // Thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread execution completed.");
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("State after thread creation: " + t1.getState());
        t1.start();
        System.out.println("State after start(): " + t1.getState());
        try {
            Thread.sleep(500);
            System.out.println("State during execution: " + t1.getState());
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("State after completion: " + t1.getState());
    }
}
