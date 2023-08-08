import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSample {
    private int say = 0 ;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void artir(){
        for (int i=0;i<10000;i++){
            say++;

        }
    }
    public void thread1Fonskiyonu(){
        lock.lock();
        System.out.println("Thread 1 Çalışıyor...");
        System.out.println("Thread 1 Uyandırılmayı Bekliyor....");

        try {
            condition.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 Uyandırıldı ve İşlemine Devam Ediyor....");
        artir();


        lock.unlock();


    }
    public void thread2Fonskiyonu(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);


        lock.lock();
        System.out.println("Thread 2 Çalışıyor....");

        artir();
        System.out.println("Devam etmek için bir tuşa basın...");
        scanner.nextLine();
        condition.signal();
        System.out.println("Thread 1'i Uyandırdım.Ben gidiyorum...");

        lock.unlock();
    }
    public void threadOver(){
        System.out.println("Say değişkenin değeri  "+ say);
    }

}
