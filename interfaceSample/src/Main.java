// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha havalimanına hoşgeldiniz ....");
        String sartlar = "Yurtdışı çıkış Kuralları\n " +
                "Herhangi bir siyasi yasağınızın  bulunmaması gerekiyor\n"+
                "15 TL harç bedelini tam olarak yatırmanız gerekiyor...\n "+
                "Gideceğiniz ülkeye vizenizin bulunması gerekiyor....\n ";
        String message = "Yurtdışı  şartlarından hepsini sağlamanız gerekiyor... !!";

        while (true){
            System.out.println("//////////////////////////////////////");
            System.out.println(message);
            System.out.println("*****************************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli Kontrol edliyor......");
            Thread.sleep(3000);
            if (yolcu.yurtdısıHarcıKontrol() == false){

                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;

            }
            System.out.println("Vize durumun kontrol ediliyor ");
            Thread.sleep(3000);
            if (yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam !!!! Yurtdışına çıkabilirsiniz");
            break;





        }



        




    }
}