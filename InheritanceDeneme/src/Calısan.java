public class Calısan {
    // Base class veya Superclass

    private String isim;
    private int maas;
    private String departman;

    public Calısan (String isim , int maas,String departman){

        this.departman = departman;
        this.isim = isim;
        this.maas = maas;
    }


    public void departmanDEgistir(String yeniDepartman ){
        System.out.println("Departman değiştiriliyor...."+yeniDepartman);
        this.departman = yeniDepartman;
        System.out.println("Yeni departman :::"+this.departman);

    }
    public int getMaas(){

        return maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    public void bilgileriGöster(){
        System.out.println("isim ::"+isim);
        System.out.println("maas::"+ maas+" TL");
        System.out.println("deparman :::"+departman);

    }
}
