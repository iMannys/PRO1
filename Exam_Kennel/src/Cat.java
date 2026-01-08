public class Cat extends Pet
{
  private boolean isChipped;

  public Cat(Date birthDay, String species, boolean isChipped)
  {
    super(birthDay, species, "Cat");
    this.isChipped = isChipped;
  }

  public boolean isChipped()
  {
    return isChipped;
  }

  public String toString()
  {
    return super.toString() + " Is chipped: " + isChipped;
  }
}
