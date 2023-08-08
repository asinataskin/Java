import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProduceConsumer {
    Random random = new Random();
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    public void produce(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            try {
                Integer value = random.nextInt(100);
                queue.put(value);
                System.out.println("Producer Üretiyor :"+value);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void cunsumer(){
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Integer value = queue.take();
                System.out.println("Consumer Tüketiyor:"+value);
                System.out.println("Queue Size :"+queue.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
