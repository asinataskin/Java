// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //220- 284

        int number = 220;
        int number2 = 284;
        int total = 0;
        int total2 = 0;

        for(int i=1;i<number;i++){

            if(number % i == 0) {

                total+=i;


            }
        }

        for(int i=1;i<number2;i++){

            if(number2 % i ==0){
                total2+=i;

            }

        }

        if (number2 == total && number == total2){

            System.out.println("sayılar arkadaş sayılardır: "+ " "+number+" "+number2);
        }

        else {

            System.out.println("bu sayılar birbirinin Arkadaş saıyları değildir");
        }




    }
}