import java.util.Map;

public class Book {
    String title;
    int releaseYear;
    Author author;
    int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        }
        return false;

    }

    public boolean matches(String world) {
        if(title.contains(world) || author.name.contains(world) || author.surname.contains(world)) {
            return true;
        }
        return false;

    }

    public int estimatePrice() {
        int price = (int) Math.floor(((pages * 3) * Math.sqrt(author.rating)));
        if(price > 250){
            return price;
        }
        return 0;
    }
}
