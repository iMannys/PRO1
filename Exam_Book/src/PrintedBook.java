public class PrintedBook extends Book
{
  private boolean isPaperback;

  public PrintedBook(String title, String isbn, boolean isPaperback)
  {
    super(title, isbn);
    this.isPaperback = isPaperback;
  }

  public boolean isPaperback()
  {
    return isPaperback;
  }

  public String getBookType()
  {
    if (isPaperback)
    {
      return "This book is a paperback book";
    }
    else
    {
      return "This is hardcover book";
    }
  }

  public String toString()
  {
    return super.toString() + " Your cover type " + getBookType();
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;
    PrintedBook other = (PrintedBook) obj;
    return super.equals(obj) && this.isPaperback == other.isPaperback;
  }
}
