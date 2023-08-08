// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197","ASUS","18.5",resolution);
        Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");
        Anakart anakart = new Anakart("B250-PRO","ASUS",10,"Windows 10");
        Bilgisayar bilgisayar = new Bilgisayar(monitor,kasa,anakart);

       bilgisayar.getKasa().bilgisaya_Ac();
       bilgisayar.getMonitor().monitoruKapat();






    }
}