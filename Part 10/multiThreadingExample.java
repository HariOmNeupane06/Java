class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class multiThreadingExample {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();

        System.out.println("Main Thread is running");
    }
}