public class Esitagırlık extends Aday {
    public Esitagırlık(int turkce, int matematik, int fizik, int edebiyat) {
        super(turkce, matematik, fizik, edebiyat);
    }

    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMatematik() *5 + getFizik()*1+getEdebiyat() *4;
    }
}
