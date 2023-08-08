// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        char harf ='ı';

        String []  kalınHarf = {"a","o","u","ı"};
        String [] ınceHarfler = {"e","ö","ü","i"};

        for(String Kalın : kalınHarf){

            if (harf == Kalın.charAt(3)){

                System.out.println(harf);

            }

        }




    }
}