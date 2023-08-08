import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       System.out.println("Ramazan pidesi uygulaması ....");
        Queue<String> pidequeue = new LinkedList<String>();
        Random random = new Random();
        pidequeue.offer("Murat");
        pidequeue.offer("Hasan");
        pidequeue.offer("OKan");
        pidequeue.offer("Ayşe");
        pidequeue.offer("Merve");
        pidequeue.offer("Ezgi");
        pidequeue.offer("Gizem");
        pidequeue.offer("Mehmet");
        pidequeue.offer("Oguz");
        pidequeue.offer("Azer");
        int pideSayısı = 1+ random.nextInt(10);
        System.out.println("Pideler Çıkıyor ...");
        System.out.println("Çıkan Pide Sayısı: "+ pideSayısı);
        Thread.sleep(3000);

        while (pideSayısı !=0){

         System.out.println(pidequeue.poll()+" pideyi aldı...");
         pideSayısı -- ;
         Thread.sleep(3000);



        }
        System.out.println("Pide Kalmadı!!...");







    }
}