// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
* put and take metodları  var güvenli olarak  kullanmamıza sağlıyor
*
* */
import java.util.logging.Logger;
import java.util.logging.Level;
public class Main {
    public static void main(String[] args) {

        ProduceConsumer pc = new ProduceConsumer();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.cunsumer();
            }
        });
        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }


    }
}