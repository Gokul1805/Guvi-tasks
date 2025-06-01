import java.util.Arrays;

public class BookManagement {
    public static void main(String[] args){
      Library library = new Library();

      Book english = new Book (book_id:1, author_name:"Author1", available_books:10); 
      library.addbook (english);
      Book tamil = new Book (book_id:2, author_name:"Author", available_books:5);
      library.addbook(tamil);

      Book[] allBooks = library.getAllbooks();
       System.out.println(Arrays.toString(allBooks));
      for (Book book : allBooks) {
        if(book != null){
            System.out.println(book.getAuthor_name());
        }
      }
    }
}
