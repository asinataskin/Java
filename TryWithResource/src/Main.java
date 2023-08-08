import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// TryWithResource yapısıyla otomatik olarak (abstract class olduğu için oradaki Closeable metodunu kullanabiliyoruz) kapanıyor
public class Main {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("diller.txt")){
            Scanner scanner = new Scanner(System.in);
            String dil ;
            while (true){
                System.out.println("Bir Dil Giriniz..");
                dil = scanner.nextLine();


                if (dil.equals("-1")){
                    System.out.println("Programdan  Çıkılıyor .....");
                    System.out.println("Dosyayı Kontrol Edin....");
                    break;
                }
                writer.write(dil+"\n");
            }

        }
        catch (IOException e){
            System.out.println("Dosya oluştururken hata oluştu...");
        }

    }
}