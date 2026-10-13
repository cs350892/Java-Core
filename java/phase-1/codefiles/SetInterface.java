/* 

CLASS 1: Book
java
class Book {
    private String isbn;        // Unique identifier (like "978-3-16-148410-0")
    private String title;
    private String author;
    private boolean isAvailable; // true = available, false = borrowed

    // Constructor
    Book(String isbn, String title, String author) {
        // VALIDATION REQUIRED:
        // - isbn cannot be null or empty
        // - title cannot be null or empty
        // - author cannot be null or empty
        // - Set isAvailable = true by default
    }

    // GETTERS AND SETTERS:
    // - getAll getters
    // - setAvailable() (only setter needed, others can be read-only)

    // toString() - Override to show book details

    // equals() - Override to compare by ISBN only
    // hashCode() - Override to use ISBN
}
📋 CLASS 2: Library
java
class Library {
    // Use Set<Book> NOT List<Book>
    private Set<Book> books = new HashSet<>();

    // 1. Add a single book
    boolean addBook(Book book) {
        // Add book to Set
        // Set automatically prevents duplicates
        // Return true if added, false if already exists
    }

    // 2. Add multiple books (bulk add)
    int addBooks(List<Book> bookList) {
        // Add all books from list to Set
        // Return count of books actually added (skipping duplicates)
    }

    // 3. Borrow a book
    boolean borrowBook(String isbn) {
        // Find book by ISBN
        // If found AND available:
        //   - Set isAvailable = false
        //   - Return true
        // Otherwise return false
    }

    // 4. Return a book
    boolean returnBook(String isbn) {
        // Find book by ISBN
        // If found AND not available:
        //   - Set isAvailable = true
        //   - Return true
        // Otherwise return false
    }

    // 5. Find book by ISBN
    Book findBookByISBN(String isbn) {
        // Find and return book
        // Return null if not found
    }

    // 6. Find books by author
    Set<Book> findBooksByAuthor(String author) {
        // Return Set of all books by this author
        // Return empty Set if none found
        // Case-insensitive search
    }

    // 7. Find books by title (contains keyword)
    Set<Book> findBooksByTitle(String keyword) {
        // Return Set of books where title contains keyword
        // Return empty Set if none found
        // Case-insensitive search
        // Example: "java" matches "Java Programming" and "Core Java"
    }

    // 8. Get all available books
    Set<Book> getAvailableBooks() {
        // Return Set of all books where isAvailable = true
    }

    // 9. Get all borrowed books
    Set<Book> getBorrowedBooks() {
        // Return Set of all books where isAvailable = false
    }

    // 10. Get total book count
    int getTotalBooks() {
        // Return total number of books in library
    }

    // 11. Get available book count
    int getAvailableCount() {
        // Return count of available books
    }

    // 12. Get borrowed book count
    int getBorrowedCount() {
        // Return count of borrowed books
    }

    // 13. Remove a book
    boolean removeBook(String isbn) {
        // Remove book by ISBN
        // Return true if removed, false if not found
    }

    // 14. Print all books
    void printAllBooks() {
        // Print all books in a formatted table
        // Show total, available, and borrowed counts
        // Handle empty library case
    }
}
📋 CLASS 3: Main (Test Your Code)
java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("\n=== TEST 1: Add Books ===");
        // Create 5-6 books with different ISBNs
        // Try adding a duplicate ISBN (should fail)
        // Print total books

        System.out.println("\n=== TEST 2: Bulk Add Books ===");
        // Create a List of 3 books
        // Add them using bulkAddBooks()
        // Print total books after bulk add

        System.out.println("\n=== TEST 3: Print All Books ===");
        // Print all books

        System.out.println("\n=== TEST 4: Borrow Book ===");
        // Borrow an available book (should succeed)
        // Try borrowing the same book again (should fail)
        // Try borrowing a non-existent book (should fail)

        System.out.println("\n=== TEST 5: Return Book ===");
        // Return the borrowed book (should succeed)
        // Try returning the same book again (should fail)

        System.out.println("\n=== TEST 6: Find by ISBN ===");
        // Find an existing book
        // Find a non-existent book

        System.out.println("\n=== TEST 7: Find by Author ===");
        // Find books by an author who exists
        // Find books by an author who doesn't exist

        System.out.println("\n=== TEST 8: Find by Title ===");
        // Find books containing a keyword
        // Find books containing a keyword that doesn't exist

        System.out.println("\n=== TEST 9: Available Books ===");
        // Get and print all available books

        System.out.println("\n=== TEST 10: Borrowed Books ===");
        // Get and print all borrowed books

        System.out.println("\n=== TEST 11: Remove Book ===");
        // Remove an existing book
        // Remove a non-existent book

        System.out.println("\n=== TEST 12: Final State ===");
        // Print final state of library with all counts
    }
}
🎯 TEST DATA TO USE
Books to Create:
java
Book b1 = new Book("ISBN-001", "Java Programming", "John Doe");
Book b2 = new Book("ISBN-002", "Python Basics", "Jane Smith");
Book b3 = new Book("ISBN-003", "Data Structures", "John Doe");
Book b4 = new Book("ISBN-004", "Spring Boot", "Mary Johnson");
Book b5 = new Book("ISBN-005", "Microservices", "Tom Wilson");
Book b6 = new Book("ISBN-006", "Clean Code", "Robert Martin");
Bulk Add Books:
java
List<Book> bulkBooks = Arrays.asList(
    new Book("ISBN-007", "Design Patterns", "John Doe"),
    new Book("ISBN-008", "Algorithms", "Thomas Cormen"),
    new Book("ISBN-003", "Duplicate", "Unknown") // This should be rejected
);
📊 EXPECTED OUTPUT EXAMPLE
text
=== TEST 1: Add Books ===
Add Java Programming (ISBN-001): true
Add Python Basics (ISBN-002): true
Add Data Structures (ISBN-003): true
Add Spring Boot (ISBN-004): true
Add Microservices (ISBN-005): true
Add Clean Code (ISBN-006): true
Add Duplicate (ISBN-001): false
Total books: 6

=== TEST 2: Bulk Add Books ===
Added from bulk: 2 (skipped 1 duplicate)
Total books after bulk: 8

=== TEST 3: Print All Books ===

=== LIBRARY CATALOG ===
Book{isbn='ISBN-001', title='Java Programming', author='John Doe', available=true}
Book{isbn='ISBN-002', title='Python Basics', author='Jane Smith', available=true}
Book{isbn='ISBN-003', title='Data Structures', author='John Doe', available=true}
Book{isbn='ISBN-004', title='Spring Boot', author='Mary Johnson', available=true}
Book{isbn='ISBN-005', title='Microservices', author='Tom Wilson', available=true}
Book{isbn='ISBN-006', title='Clean Code', author='Robert Martin', available=true}
Book{isbn='ISBN-007', title='Design Patterns', author='John Doe', available=true}
Book{isbn='ISBN-008', title='Algorithms', author='Thomas Cormen', available=true}
Total books: 8
Available: 8
Borrowed: 0

=== TEST 4: Borrow Book ===
Borrow ISBN-001: true
Borrow ISBN-001 again: false
Borrow ISBN-999: false

=== TEST 5: Return Book ===
Return ISBN-001: true
Return ISBN-001 again: false

=== TEST 6: Find by ISBN ===
Find ISBN-002: Book{isbn='ISBN-002', title='Python Basics', author='Jane Smith', available=true}
Find ISBN-999: null

=== TEST 7: Find by Author ===
Books by John Doe: 
  Book{isbn='ISBN-001', title='Java Programming', author='John Doe', available=true}
  Book{isbn='ISBN-003', title='Data Structures', author='John Doe', available=true}
  Book{isbn='ISBN-007', title='Design Patterns', author='John Doe', available=true}

Books by Unknown: []

=== TEST 8: Find by Title ===
Books with 'Java': 
  Book{isbn='ISBN-001', title='Java Programming', author='John Doe', available=true}

Books with 'Python': 
  Book{isbn='ISBN-002', title='Python Basics', author='Jane Smith', available=true}

Books with 'XYZ': []

=== TEST 9: Available Books ===
Available books (8):
  Book{isbn='ISBN-001', title='Java Programming', author='John Doe', available=true}
  Book{isbn='ISBN-002', title='Python Basics', author='Jane Smith', available=true}
  ... etc

=== TEST 10: Borrowed Books ===
Borrowed books (0): []

=== TEST 11: Remove Book ===
Remove ISBN-008: true
Remove ISBN-999: false

=== TEST 12: Final State ===

=== FINAL LIBRARY STATE ===
Total books: 7
Available: 7
Borrowed: 0

=== LIBRARY CATALOG ===
[All books except ISBN-008]


*/


import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String isbn, String title, String author){

        if(isbn== null || isbn.trim().isEmpty()){
            throw new IllegalArgumentException("isbn can't be null");
        }
        if(title==null || title.trim().isEmpty()){
            throw new IllegalArgumentException("title can't br null");
        }
        if(author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("author can't be null");
        }

        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    } 


 public String getIsbn(){ return isbn ;}
 public String getTitle(){return title ;}
 public String getAuthor(){return author ;}


 public boolean  getIsAvailable(){return isAvailable;}

 public void setIsAvailable(boolean isAvailable){

    this.isAvailable=isAvailable;
 }

@Override

public String toString(){

    return String.format("Book{isbn='%s', title='%s' , author='%s', isAvailable='%b'}",isbn,title,author,isAvailable);
}


 @Override
 public int hashCode(){
    return isbn.hashCode();
 }

 
 @Override 
 public boolean equals (Object o){

    if(this == o){
        return true;
    }

    if(!(o instanceof Book)){
        return false;
    }

   Book book = (Book) o;

   return isbn.equals(book.isbn);
 }

}

class Library {

    private Set<Book> books = new HashSet<>();

    boolean addBook(Book book){

     return books.add(book);
    }

    int addBooks (List<Book> bookList) {

    int cnt=0;

     for(Book book: bookList){
        if(books.add(book)){
            cnt++;
        }
     }
        return cnt;
    }




  boolean borrowBook(String isbn){

    for(Book book : books){
        if(book.getIsbn().equals(isbn) && book.getIsAvailable()==true){
            book.setIsAvailable(false);
            return true;
        }

        
    }
   return false;
  }

  boolean returnBook(String isbn){
    for(Book book:books){
        if(book.getIsbn().equals(isbn) && book.getIsAvailable()==false){
            book.setIsAvailable(true);
            return true;
        }
    }
    return false;
  }


  Book findBookByIsbn(String isbn){
    for(Book book: books){
        if(book.getIsbn().equals(isbn)){
            return book;
        }
    }
    return null;
  }

  Set<Book> findBooksByAuthor(String author){

    Set<Book> collection = new HashSet<>();

    for(Book book :books){
        if(book.getAuthor().equalsIgnoreCase(author)){
            collection.add(book);
        }
    }
    return collection;
  }

  Set<Book> getAvailableBooks (){
    Set<Book> availableBooks= new HashSet<>();
    for(Book b : books){
    if(b.getIsAvailable()){
        availableBooks.add(b);
    }
    }

    return availableBooks;
  }


  int getTotalBooks(){
    return books.size();
  }

  int getBorrowedCount(){
    int cnt=0;
    for( Book b: books){
        if(!b.getIsAvailable()){
            cnt++;
        }
    }
    return cnt;
  }


  boolean removeBook(String isbn){
    return books.removeIf(b->b.getIsbn().equals(isbn));
  }
  void printAllBooks(){

    for(Book b:books){
        System.out.println("Isbn no. : "+b.getIsbn());
        System.out.println("Title : "+ b.getTitle());
        System.out.println("Author : "+b.getAuthor());
        System.out.println("availability : "+ b.getIsAvailable());
    }
  }


}

class Main{


    public static void main(String[]args){

        Library l1=new Library();
    
       
    // test-1
        l1.addBook( new Book("b01","Cosmic Truth","Chandra"));
        l1.addBook(new Book("b02","Secret","jkl"));
        l1.addBook(new Book("b03","flowers","komal"));
        l1.addBook(new Book("b03","fruits","mangi"));
        l1.printAllBooks();
    
    List<Book> booksToBeAdded = new ArrayList<>();

    booksToBeAdded.add(new Book("b-04","Love","Suraj"));
    booksToBeAdded.add(new Book("b-05","Hate","Chaand"));
    booksToBeAdded.add(new Book("b-06","Neutral","Nastik"));
    

    System.out.println("Added buooks in bulk " +l1.addBooks(booksToBeAdded));
    l1.printAllBooks();

    //Borrow Books 

    System.out.println("Boorow this book : " + l1.borrowBook("b-04"));

     System.out.println("Boorow this book again : " + l1.borrowBook("b-04"));

     System.out.println("Boorow this book again : " + l1.borrowBook("b-042"));

    

    //return books :

      System.out.println("Returning the borrowed books : " + l1.returnBook("b-04"));

      System.out.println("Returning the borrowed books again : " + l1.returnBook("b-04"));

     //find By Isbn

       System.out.println("finding book y isbn - b02 : "+ l1.findBookByIsbn("b02"));
       System.out.println("finding book y isbn - b023: "+ l1.findBookByIsbn("b023"));


     //find But Author 

        System.out.println("Finding book by its author : " + l1.findBooksByAuthor("Chandra"));
        System.out.println("Finding book by its author : " + l1.findBooksByAuthor("ChandraSDE"));

        //availble books

       System.out.println( l1.getAvailableBooks());
        l1.printAllBooks();

         System.out.println("Get total books : "+ l1.getTotalBooks());
         System.out.println("Get borrowed books : "+ l1.getBorrowedBooks());


         System.out.println("Deletoing book : "+ l1.removeBook("b01"));



    }
}

  