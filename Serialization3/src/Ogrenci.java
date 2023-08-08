import java.io.Serializable;
/// public transient String bolum; // Bu şekilde tanımlarsak bölümü yazdırmaz. Serileştirme işlemi yapmaz.


public class Ogrenci implements Serializable {
    
    private String isim;
    private int id;
    private String bolum;
    
    private static int ogrenci_sayisi = 0;/// Serileştirme işlemi yapmaz. Ögrenci Sayısı = 0 olur. başına transient yazılmış gibi davranır.
    ///Objeyi ait değil gibi davranıyor.

     public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }
    
    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        
        String bilgiler =  "Öğrenci İsmi :" + isim +
                           "\nÖğrenci Numarası : " + id +
                           "\nÖğrenci Bölüm : " + bolum;
        
        return bilgiler;
        
    }
    
    
    
}
