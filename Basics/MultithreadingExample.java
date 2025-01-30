//Harness the power of multiple threads for concurrent execution.
class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is executing");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}
