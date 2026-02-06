public class EBook extends Book
{
  private String url;

  public EBook(String url, String title, String isbn)
  {
    super(title, isbn);
    this.url = url;
  }

  public String getUrl()
  {
    return url;
  }

  public String getBookType()
  {
    return "This book is an Ebook";
  }

  public String toString()
  {
    return super.toString() + " Is Ebook?: " + getBookType() + " URL to EBook: " + url;
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;
    EBook other = (EBook) obj;
    return super.equals(obj) && url.equals(other.url);
  }
}
