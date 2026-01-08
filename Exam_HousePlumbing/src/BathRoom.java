public class BathRoom extends RoomWithPlumbing
{
  private boolean hasShower;

  public BathRoom(double size, boolean hasShower)
  {
    super("BathRoom", size, true);
    this.hasShower = hasShower;
  }

  public boolean hasShower()
  {
    return hasShower;
  }

  public Room copy()
  {
    return new BathRoom(super.getSize(), hasShower);
  }

  @Override public String toString()
  {
    return super.toString() + " hasShower: " + hasShower;
  }
}
