public class Hotel
{
  private String name;
  private HotelRoom[] rooms;

  public Hotel(String name, HotelRoom[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int availableRooms = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        availableRooms++;
      }
    }
    return availableRooms;
  }

  public int getNumberOfAvailableRooms(String type)
  {
    int availableRooms = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      String roomType = rooms[i].getType();
      if (!rooms[i].isOccupied() && roomType.equals(type))
      {
        availableRooms++;
      }
    }
    return availableRooms;
  }
  
  public HotelRoom getFirstAvailableRoom()
  {
    for (int i = 0; i < rooms.length; i++)
    {
      if (!rooms[i].isOccupied())
      {
        return rooms[i];
      }
    }
    return null;
  }

  public HotelRoom getFirstAvailableRoom(double maxPrice)
  {
    return null;
  }
}
