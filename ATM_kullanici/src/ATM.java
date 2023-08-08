import java.util.Scanner;

public class ATM {

    public void calıs(Hesap hesap){
        Login login = new Login();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz ");
        System.out.println("------------------------");

        int girisHakkı = 3;



        System.out.println("Bilgileri Girmeniz Gerekmektedir");
        System.out.println("*********************************");
        while (true){

            if(login.Login(hesap)){
                System.out.println("Giriş Başarılı .......");



            }
            else {
                System.out.println("Giriş Başarısız ");
                girisHakkı-=1;
                System.out.println("Kalan Giriş Hakkı"+girisHakkı);


            }
            if (girisHakkı == 0){


                System.out.println("Giriş Hakkınız Dolmuştur Bankanızdan Yeni bir parola istiyiniz");
                return;
            }

            System.out.println("-----------------------------------------------");
            String islemler = "1.Bakiye Görüntüle \n"
                    +"2. Para Yatrıma\n "
                    +"3. Para Çekme İşlemi\n"
                    +"Çıkış için q ya basınız";
            System.out.println(islemler);
            System.out.println("--------------------------------------------------");

            while (true) {
                System.out.println("işlem Seçiniz : ");
                String islem = scanner.nextLine();
                if (islem.equals("q")){

                    System.out.println("Çıkış Yapılıyor");


                } else if (islem.equals("1")) {

                    System.out.println("Para Yatırma işlemi Yaplıyor"+hesap.getBakiye());

                } else if (islem.equals("2")) {
                    double tutar;
                    System.out.println("Yatırmak istediğiniz tutar .");
                    tutar = scanner.nextDouble();
                    scanner.nextLine();


                    hesap.paraYatırma(tutar);

                }
                else if (islem.equals("3")){
                    double tutar;
                    System.out.println("Para Çekmek istediğiniz tutar");
                    tutar = scanner.nextDouble();
                    scanner.nextLine();
                    hesap.paraCekme(tutar);

                }
                else {

                    System.out.println("Geçersiz İşlem ");
                }


            }






        }














    }


}
