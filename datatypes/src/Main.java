// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        char grade = 'C';


        switch (grade) {

            case 'A':

                System.out.println(" Mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println(" Çok güzel geçtiniz");
                break;
            case 'C':
                System.out.println("Fena değil : Geçtiniz");
                break;
            default:
                System.out.println("Geçersiz not girdiniz ");


        }


    }
}