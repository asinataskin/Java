import javax.management.ObjectInstance;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){

        return "Hayvan konuşuyor";
    }
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }


    public String konus(){

        return getIsim()+" Miyavlıyor ";

    }

}

class Kopek extends Hayvan{


    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim()+ "  Havlıyor";
    }
}
class  At extends Hayvan {

    public At(String isim){

        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"  Kişniyor";
    }
}





public class Main {

    public static void konustur(Object object){
        System.out.println(object.konus());

    }
    public static void main(String[] args) {


       /* Hayvan hayvan = new Kedi("Tekir");
        Hayvan hayvan1 = new Kopek("Karabaş");
        System.out.println(hayvan.konus());
        System.out.println(hayvan1.konus());



        Kopek kopek = new Kopek("Karabaş");

        if(kopek instanceof Kopek){
            System.out.println("bu nesne kopek sınıfından ");

        }

        */
        Kopek kopek = new Kopek("Karabaş");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Şahbatur");
        Hayvan hayvan = new Hayvan("Limon");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);

        if(object instanceof Kopek){
            Kopek kopek1 = (Kopek) object;

            konustur(kopek1);

        }





    }
}