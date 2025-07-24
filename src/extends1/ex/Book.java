package extends1.ex;

public class Book extends Item{
    private String author;
    private int isbn;

    public Book(String name, int price, int isbn, String author) {
        super(name, price);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 저자: "+author+", isbn: "+isbn);
    }
}
