import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümleyi Giriniz");
        String cumle = scanner.nextLine();
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>() ;

        for (int i =0;i<cumle.length();i++){
            char c = cumle.charAt(i);
            if (frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1);

            }
            else {
                frekans.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()){

            System.out.println("Karakter :"+entry.getKey()+"  "+entry.getValue()+" Kadar geçiyor...");
        }


    }
}