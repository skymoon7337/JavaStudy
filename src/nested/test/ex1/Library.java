package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookcount;

    public Library(int size) {
        books = new Book[size];
        bookcount = 0;
    }

    public void addBook(String title, String author) {
    if(bookcount<books.length){
        books[bookcount++]=new Book(title,author);
    }else{
        System.out.println("공간이 부족합니다.");
    }
    }

    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (int i = 0; i < books.length; i++) {
            System.out.println("제목: "+books[i].title+" 작가: "+books[i].author);
        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }


    }

}


