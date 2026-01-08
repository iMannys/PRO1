public abstract class Rose
{
  private String[] colours;

  public Rose(String colour)
  {
    this.colours = new String[1];
    colours[0] = colour;
  }

  public Rose(String[] colours)
  {
    this.colours = colours;
  }

  public int getNumberOfColours()
  {
    return colours.length;
  }

  public String[] getColours()
  {
    return colours;
  }

  public boolean hasColour(String colour)
  {
    for (int i = 0; i < colours.length; i++)
    {
      if (colours[i].equals(colour))
      {
        return true;
      }
    }
    return false;
  }
}
