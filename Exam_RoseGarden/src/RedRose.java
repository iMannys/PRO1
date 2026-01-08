public class RedRose extends Rose
{
  private boolean darkRed;

  public RedRose(boolean darkRed)
  {
    super(darkRed ? "Dark Red" : "Red");
  }

  public boolean isDarkRed()
  {
    return darkRed;
  }
}
