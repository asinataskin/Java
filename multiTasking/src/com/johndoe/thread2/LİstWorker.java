package com.johndoe.thread2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class LİstWorker {

    Random  random = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    /// Lock istediğimiz veri türünden yapabiliriz object,Integer,Stirng,vs..
    /// Synchronized blockları yazmamız gerekiyor ayrı ayrı lock vermek için...
    private Object lock1 = new Object();
    private Object lock2 = new Object();






    public  void list1DegerEkle(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list1.add(random.nextInt(100));
        }
    }
    public  void list2DegerEkle(){
       synchronized (lock2){
           /* metodu Synchronized yapmadık direk  kod bloğunu synchorined yaptık böylece
           * hepsine ayrı ayrı anahtar vererek iki defa beklemek  yerine bir defa bekliyor
           * */
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list2.add(random.nextInt(100));
       }
    }
    public void DegerAta(){
       for (int i=0;i<1000;i++){
           list1DegerEkle();
           list2DegerEkle();
       }
    }
    public void calıstı(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DegerAta();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DegerAta();
            }
        });
        long baslangınc = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try{
            thread2.join();
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);

        }
        System.out.println("List1:"+list1.size());
        System.out.println("List2: "+list2.size());
        long bitis = System.currentTimeMillis();

        System.out.println("Geçen Süre : "+(bitis-baslangınc));
    }
}
