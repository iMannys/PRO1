public class HourlyEmployee extends Employee
{
  private double wagePerHour;
  private double hoursWorkedPerWeek;

  public HourlyEmployee(String name, MyDate birthday, double wagePerHour, double hoursWorkedPerWeek)
  {
    super(name, birthday);
    this.wagePerHour=wagePerHour;
    this.hoursWorkedPerWeek=hoursWorkedPerWeek;
  }

  public double getWagePerHour()
  {
    return wagePerHour;
  }

  public void setWagePerHour(double wagePerHour)
  {
    this.wagePerHour = wagePerHour;
  }

  public double getHoursWorkedPerWeek()
  {
    return hoursWorkedPerWeek;
  }

  public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
  {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public double earningsPerWeek()
  {
    return hoursWorkedPerWeek*wagePerHour;
  }
}
