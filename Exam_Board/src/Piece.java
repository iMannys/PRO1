public abstract class Piece
{
  private String name;

  public Piece(String name)
  {
    if (name == null || name.isBlank())
    {
      throw new IllegalArgumentException("Name is null or blank");
    }
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public abstract String getInfo();


}
