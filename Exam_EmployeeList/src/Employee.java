public abstract class Employee
{
  private String name;
  private MyDate birthday;

  public Employee(String name, MyDate birthday)
  {
    this.name=name;

  }

  public abstract double earningsPerWeek();
}
