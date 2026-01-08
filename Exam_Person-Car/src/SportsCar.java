public class SportsCar extends Car
{
  private int speed;

  public SportsCar(String model, int year, Engine engine, int speed)
  {
    super(model, year, engine);
    this.speed = speed;
  }

  public int getSpeed()
  {
    return speed;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    if (!super.equals(obj))
    {
      return false;
    }
    SportsCar sportsCar = (SportsCar) obj;
    return sportsCar.speed == speed;
  }
}
