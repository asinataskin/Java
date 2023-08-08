import java.util.PriorityQueue;
import java.util.Queue;
class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                '}';
    }

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Player o) {
        if (this.getId() < o.getId()){
            return -1;
        }
        else if (this.getId()>o.getId()){
            return 1;
        }
        return 0;

    }
}



public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        Queue Interface ve Priotrity Queue Sınıfı
        Priotrity Queue normal queue mantığı gibi davranmaz . Elelmanlar öncelik sırasına göre yüksek öncelik kazanıp (
        Integerlarada en yüksek öncelik en küçük sayıda, en  düşük öncelik en büyük sayıdadır.
        Stringlerde en yüksek öcelikli alfabetik olarak sözlükte en önce en önce gelen stringlerde,
        en düşük öncelik alfabetik olarka sözlikte en son gelen stringlerdedir.

        FOR--------> döngüsünde yüksek öncelikteki getirmez. Hatalı bi döndürme yapar.
        )

        Kuyrukta  önlere geçer (Tıpkı Hastenedi ki Acil Servisler Gİbi)
        Add() veya Offer () metodları -----------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
        Clear() metodu------> Kuyruğu Temizler.
        Contains(Object o) ---------> o objesi kuyruğu içindeyse true, değilse False döndürür.
        Poll() ----------> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyrukta eleman yoksa (null)
        referans döner.
        Size() --------> Kuyruğun içindeki eleman sayısını döner.



        */
        /*Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);
        while (! queue.isEmpty()){
            System.out.println("Eleman Çıkarılıyor....."+ queue.poll());

        }

         */
        Queue<Player> queue = new PriorityQueue<Player>();
        queue.offer(new Player("Mustafa",1));
        queue.offer(new Player("Murat",2));
        queue.offer(new Player("Hasan",10));
        queue.offer(new Player("Kerim",5));
        queue.offer(new Player("Veli",3));

        while (! queue.isEmpty()){

            System.out.println("Elemanlar Çıkarılıyor."+queue.poll());
            Thread.sleep(3000);


        }












    }
}