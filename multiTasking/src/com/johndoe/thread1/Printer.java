package com.johndoe.thread1;

public class Printer extends Thread {
    private String isim;

    public Printer(String isim){
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim+" Çalışyor");
        for (int i=0 ;i<= 10; i++){
            System.out.println(isim+" Çalışyor");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sistem kesintiye uğradı...");
                throw new RuntimeException(e);
            }
        }
        System.out.println("Sistem işini bitirdi....");
    }
}
