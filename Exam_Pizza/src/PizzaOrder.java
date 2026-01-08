import java.util.ArrayList;

public class PizzaOrder
{
  private Customer customer;
  private ArrayList<Pizza> pizzas;

  public PizzaOrder(Customer customer)
  {
    if (customer == null)
    {
      throw new IllegalArgumentException("Customer cannot be null");
    }
    this.customer = customer;
    this.pizzas = new ArrayList<>();
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public int getNumberOfPizzas()
  {
    return pizzas.size();
  }

  public void addPizza(Pizza pizza)
  {
    pizzas.add(pizza);
  }

  public Pizza getPizza(int index)
  {
    return pizzas.get(index);
  }

  public Pizza getPizza(String pizzaName)
  {
    for (int i = 0; i < pizzas.size(); i++)
    {
      if (pizzas.get(i).getName().equals(pizzaName))
      {
        return pizzas.get(i);
      }
    }
    return null;
  }

  public double getTotalPrice()
  {
    double sum = 0;
    for (int i = 0; i < pizzas.size(); i++)
    {
      sum += pizzas.get(i).getTotalPrice();
    }
    if (customer instanceof PriviligedCustomer)
    {
      PriviligedCustomer pc = (PriviligedCustomer) customer;
      sum *= (1 - pc.getDiscount()/100.0);
    }
    return sum;
  }
}
