import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


   public  static void toplama(int x, int y, int z ) {

       int toplama;
       toplama = x+ y+ z;

       System.out.println("üç sayının toplamı ::"+toplama);







   }

   public static void toplama(double x, double y, double z) {

       double toplama ;
       toplama = x+ y+ z ;

       System.out.println("üç sayının toplamı double olarak ::"+toplama);

   }

   public static void toplama(float x, float y,float z) {

       float toplama ;
       toplama = x+ y+ z;

       System.out.println("üç sayının toplamı float olarak :: "+toplama);



   }

   public  static void toplama(String x, String y, String z) {

       String toplama;

       toplama = x+ y+ z ;

       System.out.println("üç string değerinin toplamı ::"+toplama);




   }


    public static void main(String[] args) {

        toplama(12,200,300);
        toplama(12.20,20.02,30.15);
        toplama("michael jordan ","lebron james"," kobe brayt");









    }
}