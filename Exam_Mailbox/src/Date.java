public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    set(day, month, year);
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public String toString()
  {
    return "Day: " + day + " Month: " + month + " Year: " + year;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Date other = (Date) obj;
    return day == other.day &&
        month == other.month &&
        year == other.year;
  }
}
