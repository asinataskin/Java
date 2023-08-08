public class Daire extends Sekil{
    private int yarıcap;

    public Daire(String isim, int yarıcap) {
        super(isim);
        this.yarıcap = yarıcap;
    }

    @Override
    void alanHesapla() {
        double  alan = Math.PI * yarıcap * yarıcap;
        System.out.println(getIsim()+"nin Alanı "+alan +"dir");
    }
}
