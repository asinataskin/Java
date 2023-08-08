// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        double [] mylist = {1,2,3,40,5,6};
        double total = 0;
        double max = mylist[0];




        for(double array:mylist){


            if(max<array){

                max = array;

                System.out.println(max);
            }
        }

    }
}