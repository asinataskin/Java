// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ReentrantLockSample rs = new ReentrantLockSample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rs.thread1Fonskiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rs.thread2Fonskiyonu();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rs.threadOver();
    }
}