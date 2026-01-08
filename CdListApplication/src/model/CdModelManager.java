package model;

import java.util.ArrayList;

public class CdModelManager implements CdModel
{
  private CdList cdList;

  public CdModelManager()
  {
    this.cdList = new CdList();
  }

  @Override public Cd getCd(int index)
  {
    return cdList.getCd(index);
  }

  @Override public CdList getCdsByTitle(String title)
  {
    return cdList.getCdsByTitle(title);
  }

  @Override public int getNumberOfCds()
  {
    return cdList.getNumberOfCds();
  }

  @Override public void addCd(Cd cd)
  {
    cdList.addCd(cd);
  }

  @Override public Cd removeFirstCdByTitle(String title)
  {
    return cdList.removeFirstCdByTitle(title);
  }

  @Override public void clear()
  {
    this.cdList = new CdList();
  }
}
