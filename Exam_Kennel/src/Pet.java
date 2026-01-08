public abstract class Pet
{
  private String id;
  private String species;
  private Date birthDate;
  private static int running_ID = 10001;

  public Pet(Date birthDate, String species, String prefixId)
  {
    this.id = prefixId + running_ID;
    this.species = species;
    this.birthDate = birthDate.copy();
    running_ID++;
  }

  public String getId()
  {
    return id;
  }

  public String getSpecies()
  {
    return species;
  }

  public Date getBirthDate()
  {
    return birthDate.copy();
  }

  public String toString()
  {
    return "Id: " + id + " Species: " + species + " Date: " + birthDate;
  }
}
