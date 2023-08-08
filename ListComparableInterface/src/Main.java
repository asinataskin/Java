import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> listStiring = new ArrayList<String>();
        listStiring.add("Java");
        listStiring.add("C++");
        listStiring.add("Python");
        listStiring.add("PHP");
        listStiring.add("Go");

        Collections.sort(listStiring);

        for (String s: listStiring){
            System.out.println(s);
        }

    }
}