import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Character [] char_dizi = {'J','A','V','A'};
        Integer [] İnteger_dizi = {1,2,3,4,5,6};

        String [] string_dizi = {"Java","Python","C++","C#","HTML"};

        Ogrenci [] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Murat"),new Ogrenci("Merve")};
        yazdir(char_dizi);
        yazdir(İnteger_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);




    }
    public static <E> void yazdir(E [] dizi){

        for (E e: dizi){
            System.out.println(e);


        }*/

        Sayısal sayısal1 = new Sayısal(30,40,30,20);
        Sayısal sayısal2 = new Sayısal(25,45,2,35);
        birinci(sayısal1,sayısal2);
        System.out.println("Birinic Oğrencinin Puanı: "+ birinci(sayısal1,sayısal2).puanHesapla());
        Esitagırlık esitagırlık1 = new Esitagırlık(40,35,10,35);
        Esitagırlık esitagırlık2 = new Esitagırlık(35,20,35,30);
        birinci(esitagırlık1,esitagırlık2);



    }



    public static <E extends Aday> E birinci(E e1, E e2){
        if (e1.puanHesapla() > e2.puanHesapla()){
            return e1;
        }
        else {
            return e2;
        }



    }
}