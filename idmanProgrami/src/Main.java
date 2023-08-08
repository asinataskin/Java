import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman  programına  hoşgeldiniz...");
        String idmanTurleri = "Geçerli Hareketler\n"+
                "Burpee\n"+
                "Pushup(Şınav sayısı)\n"+
                "Sit up \n"+
                "Squat sayısı\n"+
                "-----------------------";

        System.out.println(idmanTurleri);
        System.out.println("Bir idaman oluşturun ");
        System.out.println("Burpee sayısı ...");
        int burpeeSayısı;
        burpeeSayısı = scanner.nextInt();
        System.out.println("Pushup sayısı ...");
        int pushupSayısı;
        pushupSayısı = scanner.nextInt();
        System.out.println("Situp sayısı ...");
        int situpSayısı;
        situpSayısı = scanner.nextInt();
        System.out.println("Squat sayısı ...");
        int squatSayısı;
        squatSayısı = scanner.nextInt();
        scanner.nextLine();

        idman idman = new idman(burpeeSayısı,pushupSayısı,squatSayısı,situpSayısı);
        System.out.println("İdmanınız Başlıyor...");

        while (idman.idmanBittiMi() == false){

            System.out.println("Hareket türür(Burpee,Pushup,Situp,Squat):: ");
            String tur = scanner.nextLine();
            System.out.println("BU hareketten kaç tane yapacaksınız");
            int yapılıcakSayı = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,yapılıcakSayı);








        }
        System.out.println("idmanı başarılı şekilde bitirdiniz....");

















    }
}