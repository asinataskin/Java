import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        LİST ITERATOR VE ITERATOR
        LİST ITERATOR :
        Sadece List Interface 'i implemente eden classlarda kullanılır.
        next() ve Previous() metodu vardır.
        Ekstradan add() metodu bulunur.

        ITERATOR:
        Set, QUeue ve List Interface'i implemente eden classlardan kullanılabilir.
        previous() metodu yoktur.
        */
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        Iterator<String> iterabtor1 = set.iterator();
        Iterator<String> iterabtor2 = list.iterator();
        ListIterator<String> iterator3 = list.listIterator();

        /*while (iterabtor1.hasNext()){
            System.out.println(iterabtor1.next());

        }
        System.out.println("*****************************");
        while (iterabtor2.hasNext()){
            System.out.println(iterabtor2.next());

        }*/
        while (iterator3.hasNext()){
            System.out.println("_____-----------------------");
            System.out.println(iterator3.next());

        }






    }
}
