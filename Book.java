public class Book {
    private int book_id;
    private String author_name;
    private int available_books;

    public int getAvailable_books() {
        return available_books;
    }

    public void setAvailable_books(int available_books) {
        this.available_books = available_books;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }


    Book(int book_id, String author_name,int available_books) {
        this.book_id = book_id;
        this.author_name = author_name;
        this.available_books = available_books;
    }
}