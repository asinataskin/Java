import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kumanda Programına Hoşgeldiniz");
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler \n"+
                "\n 1. Kanalları Göster.."+
                "\n 2.Kanal Ekle.."+
                "\n 3.Kanal Sil.."
                +"\n 4.Kanal Sayısı Öğren..\n"
                +"Çıkış için  'q' Basın.. ";

        Kumanda kumanda = new Kumanda();

        while (true){
            System.out.println(islemler);
            System.out.println("İşlemi Giriniz...");
            String islem = scanner.nextLine();
            if (islem.equals("q")){

                System.out.println("Programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                kanallarıGoster(kumanda);

            }
            else if (islem.equals("2")) {
                System.out.println("Eklenecek Kanal");
                String Kanal = scanner.nextLine();
                kumanda.kanalEkle(Kanal);


            }
            else if (islem.equals("3")) {
                System.out.println("Silinecek Kanal");
                String skanal = scanner.nextLine();
                kumanda.kanalSil(skanal);


            }
            else if (islem.equals("4")) {
                System.out.println("Kanal Sayısı::  "+kumanda.kanalSayısı());

            }
            else {
                System.out.println("Hatalı Giriş YAPTINIZ");
            }


        }

    }
    public static void kanallarıGoster(Kumanda kumanda){
        if (kumanda.kanalSayısı()==0){
            System.out.println("Şu anda hiçbir kanal bulunmuyor.....");

        }
        else {
            for (String s : kumanda){
                System.out.println(s);
            }
        }
    }
}