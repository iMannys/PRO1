public class HotelTest
{
  public static void main(String[] args)
  {
    // Hard coded everything to test every method

    HotelRoom[] rooms = new HotelRoom[5];

    rooms[0] = new HotelRoom(101, HotelRoom.SINGLE);
    rooms[1] = new HotelRoom(102, HotelRoom.DOUBLE);
    rooms[2] = new HotelRoom(103, HotelRoom.FAMILY);
    rooms[3] = new HotelRoom(201, HotelRoom.SINGLE);
    rooms[4] = new HotelRoom(202, HotelRoom.FAMILY);

    Hotel hotel = new Hotel("Comwell Hotel", rooms);
    System.out.println("Hotelname: " + hotel.getName());
    System.out.println("Rooms in hotel: " + hotel.getNumberOfRooms());

    System.out.println();

    Guest tobias = new Guest("Tobias", 12121212);
    Guest matthias = new Guest("Matthias", 13131313);
    Guest alex = new Guest("Alexander", 14141414);
    System.out.println(tobias);
    System.out.println(matthias);
    System.out.println(alex);

    System.out.println();

    rooms[1].registerGuest(tobias);
    rooms[2].registerGuest(matthias);
    rooms[4].registerGuest(alex);

    System.out.println("Available rooms: " + hotel.getNumberOfAvailableRooms());
    System.out.println("Available family rooms: " + hotel.getNumberOfAvailableRooms(HotelRoom.FAMILY));
    System.out.println("First available room: " + hotel.getFirstAvailableRoom());
    System.out.println("First available room under 70: " + hotel.getFirstAvailableRoom(70));
    System.out.println("First available room under 40: " + hotel.getFirstAvailableRoom(40));

    System.out.println();

    System.out.println("All available rooms: ");
    HotelRoom[] allRooms = hotel.getAllAvailableRooms(HotelRoom.SINGLE);
    for (HotelRoom room : allRooms)
    {
      System.out.println(room);
    }

    System.out.println();

    System.out.println("Hotel has guest Tobias: " + hotel.hasGuest(tobias));

    System.out.println();

    System.out.println("Matthias has room: " + hotel.getRoom(matthias));
  }
}
