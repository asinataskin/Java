import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int toplama(int x ,int y) {

        return x+y;

    }
    public static int toplama(int x, int y, int z){

        return x+y+z;


    }
    public static int carpma(int x,int y){

        return  x*y ;
    }
    public static int carpma(int x,int y,int z){

        return x*y*z;
    }

    public static double bolme(double x, double y){

        return x/y;

    }

    public static int cıkarma (int x, int y){

        return x-y ;
    }

    public static int cıkarma (int x , int y, int z){


        return x-y-z;

    }







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String işlemler = "1.Toplama işlemi\n"+"2.Çıkarma işlemi\n"+
                "3.Çarpma işlemi\n"+"4.Bölme işlemi\n";

        System.out.println("*************************");
        System.out.println(işlemler);
        System.out.println("---------------------------");
        while (true){
            System.out.println("İşlem seçiniz");
            String işlem = scanner.nextLine();

            if(işlem.equals("0")){

                System.out.println("çıkış yaplıyor");
                break;


            }
            else if (işlem.equals("1")) {

                String kac_sayı;
                System.out.println(" hesaplancak sayı adetini  giriniz ::");

                kac_sayı = scanner.nextLine();

                if (kac_sayı.equals("2")) {
                    int a, b;
                    System.out.println("birinci sayıyı giriniz::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ");
                    b = scanner.nextInt();

                    toplama(a, b);
                    System.out.println("girilen iki sayının toplamı " + toplama(a, b));


                } else if (kac_sayı.equals("3")) {

                    int a, b, c;
                    System.out.println("ilk sayıyı giriniz ::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ::");
                    b = scanner.nextInt();
                    System.out.println("üçüncü sayıyı giriniz::");
                    c = scanner.nextInt();

                    toplama(a, b, c);
                    System.out.println("girilen üç sayının toplamı :::" + toplama(a, b, c));


                } else {

                    System.out.println("hatalı giriş yaptınız ");
                    break;


                }


            }
            else if (işlem.equals("2")) {
                String kac_sayıs ;
                System.out.println("girilecek sayı adetini giriniz;;");
                kac_sayıs = scanner.nextLine();

                if ((kac_sayıs.equals("2"))){
                    int a,b;
                    System.out.println("birinci sayıyı giriniz ::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ");
                    b = scanner.nextInt();

                    cıkarma(a,b);
                    System.out.println("iki sayının çıkarımı"+cıkarma(a,b));








                }
                else if (kac_sayıs.equals("3"))
                {

                    int a,b,c;
                    System.out.println("birinci sayıyı giriniz ::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ");
                    b = scanner.nextInt();
                    System.out.println("üçüncü sayıyı giriniz ::");
                    c = scanner.nextInt();
                    cıkarma(a,b,c);

                    System.out.println("üç sayının çıkarma işlemi ::"+cıkarma(a,b,c));





                }
                else {

                    System.out.println("HAtalı giriş yaptınız .........");
                    break;




                }


            }
            else if (işlem.equals("3")) {
                String kac_sayıs ;
                System.out.println("girilecek sayı adetini giriniz;;");
                kac_sayıs = scanner.nextLine();

                if ((kac_sayıs.equals("2"))){
                    int a,b;
                    System.out.println("birinci sayıyı giriniz ::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ");
                    b = scanner.nextInt();

                    carpma(a,b);
                    System.out.println("iki sayının çarpımı"+carpma(a,b));








                }
                else if (kac_sayıs.equals("3"))
                {

                    int a,b,c;
                    System.out.println("birinci sayıyı giriniz ::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ");
                    b = scanner.nextInt();
                    System.out.println("üçüncü sayıyı giriniz ::");
                    c = scanner.nextInt();
                    carpma(a,b,c);

                    System.out.println("üç sayının çarpımı işlemi ::"+carpma(a,b,c));





                }
                else {

                    System.out.println("HAtalı giriş yaptınız .........");
                    break;




                }


            }
            else if (işlem.equals("4")) {
                String kac_sayıs ;
                System.out.println("girilecek sayı adetini giriniz;;");
                kac_sayıs = scanner.nextLine();

                if ((kac_sayıs.equals("2"))){
                    int a,b;
                    System.out.println("birinci sayıyı giriniz ::");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayıyı giriniz ");
                    b = scanner.nextInt();

                    bolme(a,b);
                    System.out.println("iki sayının bölümü  "+bolme(a,b));








                }
                else {

                    System.out.println("HAtalı giriş yaptınız .........");
                    break;




                }


            }



        }
















    }
}