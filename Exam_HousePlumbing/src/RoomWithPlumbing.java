public class RoomWithPlumbing extends Room
{
  private boolean floorDrain;

  public RoomWithPlumbing(String name, double size, boolean hasFloorDrain)
  {
    super(name, size);
    this.floorDrain = hasFloorDrain;
  }

  public boolean hasFloorDrain()
  {
    return floorDrain;
  }

  public Room copy()
  {
    return new RoomWithPlumbing(super.getName(), super.getSize(), floorDrain);
  }

  @Override public String toString()
  {
    return super.toString() + " hasFloorDrain: " + floorDrain;
  }
}
