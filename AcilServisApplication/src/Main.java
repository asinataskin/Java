import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        acilServis.offer(new Hasta("Murat Bey ","Yanık"));
        acilServis.offer(new Hasta("Mustafa Bey ","Baş Ağrısı"));
        acilServis.offer(new Hasta("Elif Hanım ","Apandisit"));
        acilServis.offer(new Hasta("Oğuz Bey ","Yanık"));
        acilServis.offer(new Hasta("Merve Hanım ","Yanık"));
        acilServis.offer(new Hasta("Gizem Hanım ","Apandisit"));

        int i = 1;
        while (acilServis.isEmpty() != true){

            System.out.println("**********************************");
            System.out.println(i+" Sırada");
            System.out.println(acilServis.poll());
            Thread.sleep(3000);
            i++;

        }

    }
}