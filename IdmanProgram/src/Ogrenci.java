import java.io.Serializable;

public class Ogrenci implements Serializable {
    private static final long serialVersionUID = 1000;///Klassmızda herhangi bir değişiklik yaparsak bunun javanın farketmesini sağlıyoruz..

    private  String isim;
    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String  bilgiler = " Öğrenci bilgiler :"+ isim
                +"\nÖğrenci Numarası : "+id
                +"\nÖğrencinin Bölümü: "+bolum;
        return bilgiler;
    }
}
