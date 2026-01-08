public class Name
{
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName)
  {
    if (firstName == null || lastName == null || firstName.length() <= 2 || lastName.length() <= 2)
    {
      throw new IllegalArgumentException("Illegal argument");
    }

    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Name(String fullName)
  {
    if (fullName == null || fullName.length() < 2)
    {
      throw new IllegalArgumentException("Illegal argument");
    }

    String[] parts = fullName.split("\\s+"); // Split spaces or any characters

    if (parts.length < 2)
    {
      throw new IllegalArgumentException("Illegal argument");
    }

    this.firstName = parts[0];

    for (int i = 1; i < parts.length-1; i++)
    {
      this.firstName = this.firstName + " " + parts[i];
    }

    this.lastName = parts[parts.length-1];
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public String getFormalName()
  {
    return lastName + ", " + firstName;
  }

  @Override public String toString()
  {
    return getFullName();
  }

  public boolean equals(Object other)
  {
    if (other == null || other.getClass() != getClass())
    {
      return false;
    }
    Name nameOther = (Name) other;
    return firstName.equals(nameOther.firstName) &&
        lastName.equals(nameOther.lastName);
  }
}