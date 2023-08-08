import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int girisHakkı = 3;
        String sys_kullanıcı = "Musatafa Murat";
        String sys_parola = "12345";

        System.out.println("************************");
        System.out.println("Kullanıcı girişine  hoşgeldiniz.....");

        while (true){

            System.out.println("Kullanıcı Adı : ");
            String kullanıcı = scanner.nextLine();
            System.out.println("Kullanıcı parola : ");
            String parola = scanner.nextLine();

            if (sys_kullanıcı == kullanıcı && sys_parola == parola){
                System.out.println("Kullanıcı adını ve parolayı doğru girdiniz ");

            }
            if (kullanıcı.equals(sys_kullanıcı) && !parola.equals(sys_parola)){

                System.out.println("Parolanız yanlış");
                girisHakkı-=1;


            }
            if (!kullanıcı.equals(sys_kullanıcı) && parola.equals(sys_parola)){

                System.out.println("Kullanıcı yanlış");
                girisHakkı-=1;


            }
            else {

                System.out.println("Kulanıcı adınız ve parolanız yanlış");

                girisHakkı-=1;
            }
            if (girisHakkı == 0) {

                System.out.println("Giriş Hakkınız bitti iyi günler dileriz");

                break;
            }






        }







    }
}