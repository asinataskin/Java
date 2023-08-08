import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Buyuktenkucuge implements Comparator<String>{
    
 @Override
    public int compare(String o1,String o2){
     
     return -o1.compareTo(o2);
     
     
 }



} 
class Player implements Comparable<Player>{
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + getId() + " İsim :" + isim + " |||";
       
    }

    @Override
    public int compareTo(Player player) {

        if (this.getId() < player.getId()) {
            
            return -1;
            
        }
        else if (this.getId() > player.getId()) {
            return 1;
            
        }
        return 0;
        


    }
    

    
}
class KucukBuyuyePlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        
        if (o1.getId() < o2.getId()) {
            
            return -1;
            
        }
        else if (o1.getId() > o2.getId()) {
            return 1;
            
        }
        return 0;
        
    }
    
}

class BuyuktenkucugePlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()){
            return 1;
        }
        else if(o1.getId() > o2.getId()){
            return -1;
        }
        return 0;


    }

     
     
 }
public class Main {
    public static void main(String[] args) {
        
       List<String> list_string = new ArrayList<String>();
        
       /*  
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string,new Buyuktenkucuge());
        
         for (String s : list_string) {
            System.out.println(s);
        }*/
         
       
          List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player("Murat", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oğuz", 10));
        list_player.add(new Player("Yusuf", 4));
        
        Player p1 = new Player("Murat", 5);
        Player p2 = new Player("Yusuf", 4);
        
       // Collections.sort(list_player,new KucukBuyuyePlayer());
        Collections.sort(list_player,new BuyuktenkucugePlayer());
         for (Player p : list_player) {
            
            System.out.println(p);
            
        }
       // System.out.println(p1.compareTo(p1));
        
       /*  Collections.sort
        
       
        
        Set<Player> treeset = new  TreeSet<Player>();
        
        treeset.add(new Player("Murat", 5));
        treeset.add(new Player("Emre", 1));
        treeset.add(new Player("Oğuz", 10));
        treeset.add(new Player("Yusuf", 4));
        
        for (Player p : treeset) {
            System.out.println(p);
            
        }*/
        
        
    }

    @Override
    public String toString() {
        return "Main []";
    }

}



