import java.io.*;

public class OyunKayıt {
    public  static  void oyunKaydet(Kart[][] kartlar){
        try(ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){
            System.out.println("Oyun kaydediliyor...");
            out.writeObject(kartlar);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static Kart[] [] kayıttanAL(){

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
            Kart [][] cikti = (Kart [][]) in.readObject();
            return cikti;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
