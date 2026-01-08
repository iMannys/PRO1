public class PriviligedCustomer extends Customer
{
  private double discount;

  public PriviligedCustomer(String name)
  {
    super(name);
    this.discount = 0;
  }

  public double getDiscount()
  {
    return discount;
  }

  public void setDiscount(double percentage)
  {
    this.discount = percentage;
  }
}
