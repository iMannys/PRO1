public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job(String title, double salary)
  {
    this(title, salary, null);
  }

  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public boolean isAvailable()
  {
    return employee == null;
  }

  public void hire(Person employee)
  {
    if (isAvailable())
    {
      this.employee = employee;
    }
  }

  public void fire()
  {
    this.employee = null;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  @Override public String toString()
  {
    return "Position/title: " + title +
        "\nSalary: " + salary +
        "\nEmployee: \n" + employee;
  }

  @Override public boolean equals(Object other)
  {
    if (other == null || other.getClass() != getClass())
    {
      return false;
    }
    Job otherJob = (Job) other;
    boolean equalEmployees = !isAvailable() && !otherJob.isAvailable();
    if (equalEmployees) // If both have non-null employees check if they are the same
    {
      equalEmployees = employee.equals(otherJob.employee);
    }
    else equalEmployees = isAvailable() && otherJob.isAvailable(); // Else try seeing if both are null
    return title.equals(otherJob.title) &&
        salary == otherJob.salary &&
        equalEmployees;
  }
}
