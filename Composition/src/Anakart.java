public class Anakart {
    private  String model;
    private  String uretic;
    private  int yuva_sayısı;
    private  String isletim_sistemi;

    public Anakart(String model, String uretic, int yuva_sayısı, String isletim_sistemi) {
        this.model = model;
        this.uretic = uretic;
        this.yuva_sayısı = yuva_sayısı;
        this.isletim_sistemi = isletim_sistemi;

    }
    public void isletim_sistemi_yukle(String isletim_sistemi){

        this.isletim_sistemi = isletim_sistemi;
        System.out.println("İşletim Sistemi Yüklendi :: "+isletim_sistemi);


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretic() {
        return uretic;
    }

    public void setUretic(String uretic) {
        this.uretic = uretic;
    }

    public int getYuva_sayısı() {
        return yuva_sayısı;
    }

    public void setYuva_sayısı(int yuva_sayısı) {
        this.yuva_sayısı = yuva_sayısı;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }

}
