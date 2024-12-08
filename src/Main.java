public class Main {
    public static void main(String[] args) {
        Book book = new Book("Книга", 2004, new Author("Алекксей","Жуков", 3), 150);
        System.out.println(book.isBig());
        System.out.println(book.matches("Жук"));
        System.out.println(book.estimatePrice());
    }
}