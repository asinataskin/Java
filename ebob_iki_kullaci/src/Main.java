import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void Ebob(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz ::");
        int x,y;
        x = scanner.nextInt();
        System.out.println(" ikinci sayıyı giriniz :: ");
        y = scanner.nextInt();

        if (x > y) {
            for (int i = 2; i < y; i++) {

                if (x % i == 0 && y % i == 0) {
                    int isEbob ;
                    isEbob =1;
                    isEbob *= i;




                    System.out.println("iki sayının ebobu ::" + isEbob);


                }


            }


        }
        else {
            for (int i = 2; i < x; i++) {

                if (x % i == 0 && y % i == 0) {
                    int isEbob ;
                    int toplama ;
                    toplama =0;
                    toplama+=i;
                    System.out.println("toplama::"+toplama);

                    isEbob =1;
                    isEbob*=i;



                    System.out.println("iki sayının ebobu ::" + isEbob);


                }


            }





        }






    }

    public static void main(String[] args) {


        Ebob();



    }
}