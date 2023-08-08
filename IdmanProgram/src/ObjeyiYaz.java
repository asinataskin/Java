import java.io.*;

public class ObjeyiYaz {
    public static void main(String[] args) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            Ogrenci ogrenci1 = new Ogrenci("Musatafa Murat",1234,"Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Gökçe Bahadır",678,"Finansal Matematik");
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);

        } catch (FileNotFoundException e) {
           System.out.println("Dosya bulunamadı....");
        } catch (IOException e) {
            System.out.println("Dosya Açılırken IOException Oluştu...");
        }
    }
}
