public class WeighedItem extends Item
{
  private double weight;

  public WeighedItem(String name, double price, double weight)
  {
    super(name, price);
    this.weight = weight;
  }

  public double getWeight()
  {
    return weight;
  }

  public String getInfo()
  {
    return "" + weight;
  }
}
