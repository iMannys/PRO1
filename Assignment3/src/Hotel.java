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
    for (HotelRoom room : rooms)
    {
      if (!room.isOccupied())
      {
        availableRooms++;
      }
    }
    return availableRooms;
  }

  public int getNumberOfAvailableRooms(String type)
  {
    int availableRooms = 0;
    for (HotelRoom room : rooms)
    {
      String roomType = room.getType();
      if (!room.isOccupied() && roomType.equals(type))
      {
        availableRooms++;
      }
    }
    return availableRooms;
  }

  public HotelRoom getFirstAvailableRoom()
  {
    for (HotelRoom room : rooms)
    {
      if (!room.isOccupied())
      {
        return room;
      }
    }
    return null;
  }

  public HotelRoom getFirstAvailableRoom(double maxPrice)
  {
    for (HotelRoom room : rooms)
    {
      if (!room.isOccupied() && room.getPrice() <= maxPrice)
      {
        return room;
      }
    }
    return null;
  }

  public HotelRoom[] getAllAvailableRooms(String roomType)
  {
    int length = getNumberOfAvailableRooms(roomType);
    if (length == 0)
    {
      return null;
    }

    HotelRoom[] availableRooms = new HotelRoom[length];

    int index = 0;
    for (HotelRoom room : rooms)
    {
      String type = room.getType();
      if (!room.isOccupied() && type.equals(roomType))
      {
        availableRooms[index] = room;
        index++;
      }
    }
    return availableRooms;
  }

  public boolean hasGuest(Guest guest)
  {
    for (HotelRoom room : rooms)
    {
      Guest roomGuest = room.getGuest();
      if (room.isOccupied() && roomGuest.equals(guest))
      {
        return true;
      }
    }
    return false;
  }

  public HotelRoom getRoom(Guest guest)
  {
    for (HotelRoom room : rooms)
    {
      Guest roomGuest = room.getGuest();
      if (room.isOccupied() && roomGuest.equals(guest))
      {
        return room;
      }
    }
    return null;
  }
}
