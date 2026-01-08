import java.util.ArrayList;

public class RoseGarden
{
  private Address address;
  private ArrayList<Rose> roses;

  public RoseGarden(Address address)
  {
    this.address = address.copy();
    this.roses = new ArrayList<>();
  }

  public Address getAddress()
  {
    return address.copy();
  }

  public int getNumberOfRoses()
  {
    return roses.size();
  }

  public Rose get(int index)
  {
    return roses.get(index);
  }

  public ArrayList<Rose> getByColour(String colour)
  {
    ArrayList<Rose> rosesByColour = new ArrayList<>();
    for (int i = 0; i < roses.size(); i++)
    {
      if (roses.get(i).hasColour(colour))
      {
        rosesByColour.add(roses.get(i));
      }
    }
    return rosesByColour;
  }

  public ArrayList<RedRose> getAllDarkRedRoses()
  {
    ArrayList<RedRose> darkRedRoses = new ArrayList<>();

    for (int i = 0; i < roses.size(); i++)
    {
      if (roses.get(i) instanceof RedRose redRose)
      {
        if (redRose.isDarkRed())
        {
          darkRedRoses.add(redRose);
        }
      }
    }
    return darkRedRoses;
  }

  public int getNumberOfDoubleColourRosesByColour(String colour)
  {
    int counter = 0;

    for (int i = 0; i < roses.size(); i++)
    {
      Rose rose = roses.get(i);
      if (rose.hasColour(colour) && rose.getNumberOfColours() == 2)
      {
        counter++;
      }
    }

    return counter;
  }

  public ArrayList<Rose> pickBouquetByColour(String colour, int size)
  {
    ArrayList<Rose> bouquet = new ArrayList<>();

    for (int i = roses.size() - 1; i >= 0 && bouquet.size() < size; i--)
    {
      if (roses.get(i).hasColour(colour))
      {
        bouquet.add(roses.get(i));
        roses.remove(i);
      }
    }

    if (bouquet.size() < size)
    {
      throw new IllegalStateException("There are not enough roses to make a bouquet");
    }

    return bouquet;
  }

}
