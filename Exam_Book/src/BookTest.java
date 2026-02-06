public class BookTest
{
  public static void main(String[] args)
  {
    Book[] books = new Book[4];

    books[0] = new PrintedBook("Harry Potter", "12345", true);
    books[1] = new PrintedBook("Lord of the Rings", "67890", false);
    books[2] = new EBook("https://example.com/ebook1", "Digital Java", "11111");
    books[3] = new EBook("https://example.com/ebook2", "AI Programming", "22222");

    for (Book book : books)
    {
      System.out.println(book.getTitle() + ": " + book.getBookType());
    }
  }
}