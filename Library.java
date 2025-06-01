public class Library {
    private Book[] books = new Book[5];
    
    Library() {
        this.books = new Book [5]; // {null,null,null,null,null}
    }
    public boolean addbook (Book book) {
        boolean is_book_added = false;
        for (Book books : books) {
            if (book != null) {
                book = newBook;
                is_book_added = true;
            }
        }
        return is_book_added;
    }
    public Book [] getAllbooks() {
        return this.books;
    }
}
