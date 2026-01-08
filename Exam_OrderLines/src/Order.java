public class Order
{
  private int numberOfOrderLines;
  private OrderLine[] orderLines;

  public Order(int maxNumberOfOrderLines)
  {
    this.orderLines = new OrderLine[maxNumberOfOrderLines];
    this.numberOfOrderLines = 0;
  }

  public double getTotalPrice()
  {
    double sum = 0;
    for (int i = 0; i < numberOfOrderLines; i++)
    {
      Item item = orderLines[i].getItem();
      sum += item.getPrice() * orderLines[i].getAmount();
    }
    return sum;
  }

  public double getTotalWeightForWeightedItems()
  {
    double sum = 0;
    for (int i = 0; i < numberOfOrderLines; i++)
    {
      if (orderLines[i].getItem() instanceof WeighedItem)
      {
        WeighedItem weighedItem = (WeighedItem) orderLines[i].getItem();
        sum += weighedItem.getWeight() * orderLines[i].getAmount();
      }
    }
    return sum;
  }
}
