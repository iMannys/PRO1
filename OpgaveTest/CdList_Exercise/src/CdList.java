import java.util.ArrayList;

public class CdList
{
  private ArrayList<Cd> cds;

  public CdList()
  {
    this.cds = new ArrayList<>();
  }

  public Cd getCd(int index)
  {
    return cds.get(index);
  }

  public CdList getCdsByTitle(String title)
  {
    CdList newList = new CdList();
    for (int i = 0; i < cds.size(); i++)
    {
      Cd cd = cds.get(i);
      if (cd.getTitle().equals(title))
      {
        newList.addCd(cd);
      }
    }
    return newList;
  }

  public int getNumberOfCds()
  {
    return cds.size();
  }

  public void addCd(Cd cd)
  {
    cds.add(cd);
  }

  public void removeCdByIndex(int index)
  {
    cds.remove(index);
  }

  public Cd removeFirstCdByTitle(String title)
  {
    for (int i = 0; i < cds.size(); i++)
    {
      Cd cd = cds.get(i);
      if (cd.getTitle().equals(title))
      {
        return cd;
      }
    }
    return null;
  }

  @Override public String toString()
  {
    String s = "";
    for (int i=0; i < cds.size(); i++)
    {
      s += cds.get(i).toString();
      if (i != cds.size()-1)
      {
        s += "\n";
      }
    }
    return s;
  }
}
