public class Person
{
  private String name;
  private int age;
  private char gender;

  public Person(char gender, String name, int age)
  {
    this.gender = gender;
    this.name = name;
    this.age = age;
  }

  public Person(char gender, String name)
  {
    this(gender, name, 0);
  }

  public Person(char gender)
  {
    this(gender, "No Name", 0);
  }

  public Person(Person other)
  {
    this(other.gender, other.name, other.age);
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public char getGender()
  {
    return gender;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  @Override public String toString()
  {
    String genderFull = "Male";
    if (this.gender == 'F' || this.gender == 'f')
    {
      genderFull = "Female";
    }

    return "Name: " + name + "\nAge: " + age + "\nGender: " + genderFull;
  }

  @Override public boolean equals(Object other)
  {
    if (other == null || other.getClass() != getClass())
    {
      return false;
    }
    Person otherPerson = (Person) other;
    return name.equals(otherPerson.name) &&
        age == otherPerson.age &&
        gender == otherPerson.gender;
  }
}
