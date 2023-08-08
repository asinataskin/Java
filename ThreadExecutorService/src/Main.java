import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
2 thread veya 3 tane thread aynı anda çalıştır diyebiliriz.Bu yüzden bellekte çok yer kaplamasını
engelemek için Service Executor kullanabiliriz.
*
* */
public class Main {
    public static void main(String[] args) {
/*
        Thread thread1 = new Thread(new Worker("1",1));
        Thread thread2 = new Thread(new Worker("2",2));
        Thread thread3 = new Thread(new Worker("3",3));
        Thread thread4 = new Thread(new Worker("4",4));
        Thread thread5 = new Thread(new Worker("5",5));
        System.out.println("Bütün işler çalışmaya başladı...");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread5.start();
        try {
            thread5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Bütün işler tamamlandı");
*/
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i =1;i<=5;i++){
            executorService.submit(new Worker(String.valueOf(i),i));

        }
        executorService.shutdown();//// bütün threadlari kapatmamız gereken bir metod yoksa
        /// threadlar Sonlamıyor..Main de günlerce kalıyor...
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("bütün işler bitti....");

    }
}