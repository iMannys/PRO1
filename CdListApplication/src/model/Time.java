package model;

public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int h, int m, int s)
  {
    this.hour = h;
    this.minute = m;
    this.second = s;
  }

  public Time(int timeInSeconds)
  {
    if (timeInSeconds > 86400) return;

    this.hour = timeInSeconds / 3600;

    timeInSeconds = timeInSeconds % 3600;

    this.minute = timeInSeconds / 60;
    this.second = timeInSeconds % 60;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public int getTimeInSeconds()
  {
    return hour*3600+minute*60+second;
  }

  public String toString()
  {
    // Pad with 0, 2 minimum of 2 digits, d for digits
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}