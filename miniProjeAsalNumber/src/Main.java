// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int number = 25;
        boolean isPrime = true;
        for(int i=2 ;i<number;i++){

            if(number % i ==0){
                isPrime = false;


            }

            if(isPrime){

                System.out.println("Sayı asal ");
            }
            else {

                System.out.println("Sayı asal değildir");
            }



        }






    }
}