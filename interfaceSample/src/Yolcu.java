import java.util.Scanner;

public class Yolcu implements YurtdısıKuralları {
    private  int Harc;
    private  boolean siyasiYasak;
    private  boolean vizeDurumu;
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız Harc Bedeli ");
        this.Harc =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi yasağınız  bulunuyor mu?");
        String cevap = scanner.nextLine();
        if (cevap.equals("Evet") || cevap.equals("evet")){
            this.siyasiYasak = true;
        }
        else {
            this.siyasiYasak = false;
        }
        System.out.println("Vizeniz bulunuyor Mu?");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("Evet") || cevap2.equals("evet")){
            this.vizeDurumu = true;
        }
        else  {
            this.vizeDurumu = false;
        }




    }

    @Override
    public boolean yurtdısıHarcıKontrol() {
        if (this.Harc < 15){
            System.out.println("Lütfen çıkş harcını tam yatırınız");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemini tamam !!");
            return true;

        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
       if (this.siyasiYasak == true){
           System.out.println("Siyasi yasağınız bulunuyor yurtdışına çıkamazsınız ");
           return  false;

       }
       else {
           System.out.println("Siyasi yasağınız bulunmuyor");
           return true;
       }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true){
            System.out.println("Vize işlemleriniz tamam!!!");
            return true;
        }
        else {
            System.out.println("Vize gideceğiniz ülkelerde bulunmamaktadır....");
            return false;
        }
    }
}
