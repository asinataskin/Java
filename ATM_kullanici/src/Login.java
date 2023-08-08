import java.util.Scanner;

public class Login {
    Login login = new Login();

    public boolean Login (Hesap hesap){


        Scanner scanner = new Scanner(System.in);
        String kullaniciAdı, kullaniciParola;

        System.out.println("Kullanıcı Adınızı ve Soyadınızı Giriniz");
        kullaniciAdı = scanner.nextLine();
        System.out.println("Kullanıcı Parolanızı Giriniz ");
        kullaniciParola = scanner.nextLine();

        if (hesap.getIsim().equals(kullaniciAdı) && hesap.getParola().equals(kullaniciParola)) {


           return true;


        }
        else if (hesap.getParola().equals(kullaniciParola) && !hesap.getIsim().equals(kullaniciAdı)) {

           return false;

        }
        else {

            return false;
        }






    }



    }





















