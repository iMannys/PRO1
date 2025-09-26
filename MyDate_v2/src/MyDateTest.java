import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {

    /*
    Scanner input = new Scanner(System.in);

    System.out.printf("What is the day?");
    int day = input.nextInt();

    System.out.println("What is the month?");
    int month = input.nextInt();

    System.out.println("What is the year?");
    int year = input.nextInt();

    MyDate date = new MyDate(year, month, day);

    MyDate dateToday = new MyDate(2025, 9, 12);

    if (date.isBefore(dateToday))
    {
      System.out.printf("Date is before");
    }
    else
    {
      System.out.printf("Date is not before");
    }

    date.stepForwardOneDay();

    System.out.printf("Next day");
    System.out.printf(date.toString());
*/
    char ch = 'B';

    System.out.println("" + (ch < 'A' && ch > 'Z'));
    System.out.printf("" + (ch < 'A' && ch > 'Z' || ch < 'a' && ch > 'z' || ch < '0' && ch > '9'));
  }
}
