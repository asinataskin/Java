// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int toplam = topla2(2,3,4,5,6,7);

        System.out.println(toplam);






    }

    public static void ekle(){


    }

    public static void sil(){

    }

    public static int topla2( int... sayılar) {
        int toplam = 0;

        for (int sayı : sayılar) {
            toplam += sayı;


        }

        return toplam;
    }








}