import java.util.*;

public class Main {
    public static void mapYazdır(Map<Integer,String> map){
        map.put(10,"Java");
        map.put(20,"Javascript");
        map.put(300,"C++");
        map.put(40,"C#");
        map.put(5,"python");
        for (Map.Entry<Integer,String> entry:map.entrySet()){

            System.out.println("Key :"+entry.getKey()+" Value:"+entry.getValue());
        }



    }
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedhash = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        System.out.println("*************************************");

        mapYazdır(hashMap);
        System.out.println("*************************************");
        mapYazdır(treeMap);
        System.out.println("*************************************");
        mapYazdır(linkedhash);















    }

}