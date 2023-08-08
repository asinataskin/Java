import java.io.FileWriter;
import java.io.IOException;

public class Main {
     public static void main(String[] args) {

         FileWriter fileWriter = null;
         try {
             fileWriter = new FileWriter("dosya.txt");
             fileWriter.write("Kobe Bryant \nMichael Jordan\nLebron James ");
         } catch (IOException e) {
             System.out.println("Dosya açılırken IOException oluştu....");
         } finally {
             if (null != fileWriter) {
                 try{
                     fileWriter.close();
                 }
                 catch (IOException e){
                     System.out.println("Dosya Kapatılırken bir hata oluştu ");
                 }
             }
         }


     }
}
