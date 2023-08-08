// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/* LOCK ları ayarlamamızı sağlayan Wait ve Notify metodları  Synchorinized birlikte
Kullanılıyor.
* */
public class Main {
    public static void main(String[] args) {
        WaitNotify w = new WaitNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                w.thread1Fonksiyonu();
            }
        });
        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                w.thread2Fonksiyonu();
            }
        });

        thread1.start();
        thread2.start();

        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }


    }
}