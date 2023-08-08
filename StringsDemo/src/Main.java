// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String mesaj = "bugün Hava çok güzel.";

        System.out.println("Elemenan sayısı "+ mesaj.length());
        System.out.println("5.eleman "+mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char [] karakterler = new char[5];

        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.lastIndexOf("a"));

        String mesaj1 = "bugün Hava çok güzel.";

        System.out.println(mesaj1.substring(2));
        System.out.println(mesaj1.substring(2,5));

        for(String kelime:mesaj1.split(" ")){

            System.out.println(kelime);
        }

        System.out.println(mesaj1.toLowerCase());
        System.out.println(mesaj1.toUpperCase());











    }
}