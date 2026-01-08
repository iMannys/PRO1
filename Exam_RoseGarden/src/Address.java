public class Address
{
  private String town;
  private int zipCode;
  private String streetAndNumber;

  public Address(int zipCode, String town, String streetAndNumber)
  {
    this.zipCode = zipCode;
    this.town = town;
    this.streetAndNumber = streetAndNumber;
  }

  public void setZipCode(int zipCode)
  {
    if (zipCode > 1000 || zipCode < 9999)
    {
      throw new IllegalArgumentException("Zipcode is illegal");
    }
    this.zipCode = zipCode;
  }

  public Address copy()
  {
    return new Address(zipCode, town, streetAndNumber);
  }

  public String toString()
  {
    return "Town: " + town + " ZipCode: " + zipCode + " StreetAndNumber: " + streetAndNumber;
  }
}
