public class HotelRoom
{
  private int number;
  private String type;
  private double price;
  private Guest guest;

  public static final double SINGLE_PRICE = 59.50;
  public static final double DOUBLE_PRICE = 68.50;
  public static final double FAMILY_PRICE = 99.25;
  public static final String SINGLE = "Single";
  public static final String DOUBLE = "Double";
  public static final String FAMILY = "Family";

  public HotelRoom(int number, String type)
  {
    if (!type.equals(SINGLE) && !type.equals(DOUBLE) && !type.equals(FAMILY))
    {
      type = SINGLE; // Set default type to single
    }

    this.number = number;
    this.type = type;
    this.price = getRoomPrice(type);
    this.guest = null;
  }

  public int getNumber()
  {
    return number;
  }

  public String getType()
  {
    return type;
  }

  public double getPrice()
  {
    return price;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public int getFloor()
  {
    return number / 100;
  }

  public boolean isOccupied()
  {
    return guest != null;
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    this.guest = null;
  }

  public String toString()
  {
    String guestString = "Available";

    if (isOccupied())
    {
      guestString = guest.toString();
    }

    return "Number: " + number + " Type: " + type
        + " Price: " + price + " Guest: " + guestString;
  }

  public static double getRoomPrice(String type)
  {
    switch(type)
    {
      case DOUBLE:
        return DOUBLE_PRICE;
      case FAMILY:
        return FAMILY_PRICE;
      default:
        return SINGLE_PRICE;
    }
  }
}
