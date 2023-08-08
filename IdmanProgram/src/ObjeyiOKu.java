import java.io.*;

public class ObjeyiOKu {
    public static void main(String[] args) {
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {

            Ogrenci ogrenci1 = (Ogrenci) in.readObject();///Okuduğumuz veriyi tekrar Objeye dönüştürüyoruz.---->> şu şekilde (Object)
            Ogrenci ogrenci2 = (Ogrenci) in.readObject();

            System.out.println("////////////////////////////");
            System.out.println(ogrenci1);
            System.out.println("------------------------------");
            System.out.println(ogrenci2);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı....");
        } catch (IOException e) {
            System.out.println("Dosya Açılırken IOException Oluştu...");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı...");
        }
    }
}
