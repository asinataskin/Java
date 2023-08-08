import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler....\n "
                +"1.Kare Alanını Hesapla\n"
                +"2. Üçgen Alanını Hesapla\n"
                +"3. Daire Alanını Hesapla\n"
                +"Çıkış : q veya Q basınız ";
        while (true){
            System.out.println(islemler);
            System.out.println("Hangi İşlem Yapmak İstiyorsnuz ..... ");
            String sekilturu = scanner.nextLine();
            if (sekilturu.equals("q") || sekilturu.equals("Q")){
                System.out.println("Programdan Çıkılıyor......");
                break;
            }

            else if (sekilturu.equals("1")){
                System.out.println("Üçgenin Alanını Hesaplamak için Kenarlarını giriniz");
                System.out.println("ilk kenarı giriniz");
                int a = scanner.nextInt();
                scanner.nextLine();
                System.out.println("İkinci kenarı giriniz");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Üçüncü kenarı giriniz");

                int c = scanner.nextInt();
                scanner.nextLine();
                Ucgen ucgen = new Ucgen("ÜÇgen",a,b,c);
                ucgen.alanHesapla();



            }
            else if (islemler.equals("2")){

                System.out.println("Karenin  Alanını Hesaplamak için Kenar giriniz");
                System.out.println(" Kenarı giriniz:::");
                int k  = scanner.nextInt();
                scanner.nextLine();
                Kare kare = new Kare("Kare",k);
                kare.alanHesapla();

            } else if (islemler.equals("3")) {
                System.out.println("Dairenin  Alanını Hesaplamak için Yarıçapı giriniz");
                System.out.println("Yarıçapı giriniz:::");
                int yarıCap = scanner.nextInt();
                scanner.nextLine();
                Daire daire = new Daire("Daire",yarıCap);
                daire.alanHesapla();


            }
            else {
                System.out.println("Geçersiz İşlem");
            }


        }









    }
}