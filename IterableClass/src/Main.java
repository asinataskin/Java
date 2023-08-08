import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        String [] kanallar = {"Radyo Viva","Radyo Park","Kral Pop","Radyo Karnaval","Alem FM"};

        Radyo radyo = new Radyo(kanallar);
        /*
        for(String s : kanallar){
            System.out.println(s);
        }
        */
        Iterator<String> stringIterator = radyo.iterator();

        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }




    }
}