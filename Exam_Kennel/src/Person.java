public class Person
{
  private String name;
  private Date birthDate;

  public Person(String name, Date birthDate)
  {
    this.name = name;
    this.birthDate = birthDate.copy();
  }

  public String getName()
  {
    return name;
  }

  public Date getBirthDate()
  {
    return birthDate;
  }
}
