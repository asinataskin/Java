public class Sayısal extends Aday {
    public Sayısal(int turkce,int matematik, int fizik, int edebiyat){
        super(turkce,matematik,fizik,edebiyat);

    }

    @Override
    int puanHesapla() {
        return getTurkce()*5+getFizik() *4 + getMatematik()*5+getEdebiyat();
    }
}
