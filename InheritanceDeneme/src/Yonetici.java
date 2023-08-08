public class Yonetici extends Calısan {
    private int sorumlu_kisi;



    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {


        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;










    }

    public void bilgileriGöster(){

        System.out.println("İsim :: "+getIsim());
        System.out.println("Maaş ::"+getMaas()+" TL");
        System.out.println("Deparman :: "+getDepartman());

        //super.bilgileriGöster(); BASE CLASS tan bir metodu kullanma !!!!!
        System.out.println("Sorumlu olduğu kişi sayısı ::  "+sorumlu_kisi);






    }
    public void zam_yap(int yeniMaas){

        yeniMaas+=this.getMaas();
        System.out.println("Yeni Maaşı ::"+yeniMaas+" TL");
    }




}
