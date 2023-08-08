import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void mekanKontrol(int yas ){

        if(yas< 18 ){
            throw new InvalidAgeEXception("Invalid Age");


        }
        else {

            System.out.println("Mekana Hoşgeldiniz");
        }

    }


    public static void main(String[] args) {



        try
        {
            mekanKontrol(8);
        }
        catch (InvalidAgeEXception e){
            e.printStackTrace();
        }
    }
}