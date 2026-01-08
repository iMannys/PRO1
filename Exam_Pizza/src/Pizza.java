public class Pizza
{
  private String name;
  private double initialPrice;
  private int numberOfToppings;
  private Topping[] toppings;

  private static final int MAX_NUMBER_OF_TOPPINGS = 5;

  public Pizza(String name, double initialPrice)
  {
    this.name = name;
    this.initialPrice = initialPrice;
    this.numberOfToppings = 0;
    this.toppings = new Topping[MAX_NUMBER_OF_TOPPINGS];
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfToppings()
  {
    return numberOfToppings;
  }

  public void addTopping(Topping topping)
  {
    if (topping == null)
    {
      throw new IllegalArgumentException("Topping cannot be null");
    }
    if (numberOfToppings >= toppings.length)
    {
      throw new IllegalStateException("Too many toppings");
    }
    toppings[numberOfToppings] = topping;
    numberOfToppings++;
  }

  public void removeTopping(String toppingName)
  {
    for (int i = 0; i < numberOfToppings; i++)
    {
      if (toppings[i].getName().equals(toppingName))
      {
        toppings[i] = toppings[numberOfToppings-1];
        toppings[numberOfToppings-1] = null;
        numberOfToppings--;
        break;
      }
    }
  }

  public double getTotalPrice()
  {
    double sum = initialPrice;
    for (int i = 0; i < numberOfToppings; i++)
    {
      sum += toppings[i].getPrice();
    }
    return sum;
  }
}
