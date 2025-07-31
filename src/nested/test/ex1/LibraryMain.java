package nested.test.ex1;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1","저자1");
        library.addBook("책2","저자2");
        library.addBook("책3","저자3");
        library.addBook("자바 JPA","김영한");
        library.addBook("One more Thing","Jobs");
        library.addBook("One more Thing","Jobs");
        library.showBooks();

    }
}
