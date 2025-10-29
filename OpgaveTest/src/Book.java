public abstract class Book
{
  private String title;
  private String isbn;

  public Book(String title, String isbn)
  {
    this.title = title;
    this.isbn = isbn;
  }

  public String getTitle()
  {
    return title;
  }

  public String getIsbn()
  {
    return isbn;
  }

  public abstract String getBookType();

  public String toString()
  {
    return "Title: " + title + " Isbn: " + isbn;
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;
    Book book = (Book) obj;
    return title.equals(book.title) && isbn.equals(book.isbn);
  }
}
