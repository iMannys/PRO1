public class MyDate
{
  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day)
  {
    set(year, month, day);
  }

  public void set(int year, int month, int day)
  {
    if (year < 0)
    {
      this.year = -year;
    }
    else
    {
      this.year = year;
    }

    if (month < 1)
    {
      this.month = 1;
    }
    else if (month > 12)
    {
      this.month = 12;
    }
    else
    {
      this.month = month;
    }

    int daysInMonth = numberOfDaysInMonth();

    if (day < 1)
    {
      this.day = 1;
    }
    else if (day > daysInMonth)
    {
      this.day = daysInMonth;
    }
    else
    {
      this.day = day;
    }
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

  public boolean isLeapYear()
  {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public int numberOfDaysInMonth()
  {
    if (month <= 0) return 0;
    if (month == 2 && isLeapYear()) return 29;

    switch (month)
    {
      case 2:
        return 28;
      case 4, 6, 9, 11:
        return 30;
      default:
        return 31;
    }
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "No month set";
    }
  }

  public void stepForwardOneDay()
  {
    day += 1;

    if (day > numberOfDaysInMonth())
    {
      day = 1;
      month += 1;
    }

    if (month > 12)
    {
      month = 1;
      year += 1;
    }
  }

  public boolean isBefore(MyDate other)
  {
    if (year >= other.year)
    {
      if (month >= other.month && day > other.day)
      {
        return true;
      }
    }
    return false;
  }

  public String toString()
  {
    String dayText;
    String monthText;

    if (day < 10)
    {
      dayText = "0" + day;
    }
    else
    {
      dayText = "" + day;
    }

    if (month < 10)
    {
      monthText = "0" + month;
    }
    else
    {
      monthText = "" + month;
    }

    return dayText + "/" + monthText + "/" + year;
  }
}