public class OrderLine
{
  private int amount;
  private Item item;

  public OrderLine(Item item, int amount)
  {
    this.amount = amount;
    this.item = item;
  }

  public Item getItem()
  {
    return item;
  }

  public int getAmount()
  {
    return amount;
  }

}
