public class House
{
  private Room[] rooms;

  public House(Room[] rooms)
  {
    this.rooms = new Room[rooms.length];
    for (int i = 0; i < rooms.length; i++)
    {
      this.rooms[i] = rooms[i];
    }
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public double getTotalSize()
  {
    double sum = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      sum += rooms[i].getSize();
    }
    return sum;
  }

  public int getNumberOfBathrooms()
  {
    int count = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i] instanceof BathRoom)
      {
        count++;
      }
    }
    return count;
  }

  public void rebuildRoom(int index, Room room)
  {
    Room copy = room.copy();
    rooms[index] = copy;
  }

  public void CombineTwoRoomsIntoOne(int index1, int index2, Room room)
  {
    rooms[index2] = rooms[rooms.length-1];
    rooms[rooms.length-1] = null;
    rooms[index1] = room;

    Room[] newRooms = new Room[rooms.length-1];

    for (int i = 0; i < rooms.length-1; i++)
    {
      newRooms[i] = rooms[i];
    }

    this.rooms = newRooms;
  }

}
