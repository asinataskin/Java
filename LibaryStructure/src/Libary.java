import java.util.Map;

public class Libary {
    private int Number_of_books;
    private String name;
    private Map<String,Integer> bookGenres;

    public  Libary(int number_of_books, String name, Map<String, Integer> bookGenres) {
        Number_of_books = number_of_books;
        this.name = name;
        this.bookGenres = bookGenres;
    }

    public int getNumber_of_books() {
        return Number_of_books;
    }

    public void setNumber_of_books(int number_of_books) {
        Number_of_books = number_of_books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getBookGenres() {
        return bookGenres;
    }

    public void setBookGenres(Map<String, Integer> bookGenres) {
        this.bookGenres = bookGenres;
    }
}
