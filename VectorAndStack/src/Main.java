import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* Vector<String> vector = new Vector<String>();
        ArrayList<String> arrayList =new ArrayList<String>();

        vector.add("Java");
        vector.add("Pyhton");
        vector.add("PHP");
        vector.add("C++");

        for (String s : vector){
            System.out.println(s);
        }
        System.out.println("//////////////////////////////////////");

        ListIterator<String> Iterator = vector.listIterator();
        while(Iterator.hasNext()){

            System.out.println(Iterator.next());
        }

        Enumeration<String> enumaration = vector.elements();

        while (enumaration.hasMoreElements()){
            System.out.println(enumaration.nextElement());
        }
        */
        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("PHP");
        stack.push("C++");
        stack.push("Javascript");

        stack.pop();
         for (String s : stack){
             System.out.println(s);
         }







    }
}