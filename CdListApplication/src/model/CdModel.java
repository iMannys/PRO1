package model;

public interface CdModel
{
  Cd getCd(int index);
  CdList getCdsByTitle(String title);
  int getNumberOfCds();
  void addCd(Cd cd);
  Cd removeFirstCdByTitle(String title);
  void clear();
}
