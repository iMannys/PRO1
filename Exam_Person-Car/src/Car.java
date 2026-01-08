public class Car
{
  private String model;
  private int year;
  private Engine engine;

  public Car(String model, int year, Engine engine)
  {
    if (engine == null)
    {
      throw new IllegalArgumentException("Engine cannot be null");
    }
    this.model = model;
    this.year = year;
    this.engine = engine;
  }

  public String getModel()
  {
    return model;
  }

  public int getYear()
  {
    return year;
  }

  public Engine getEngine()
  {
    return engine;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Car car = (Car) obj;
    return this.model.equals(car.model) && this.year == car.year
        && this.engine.getSize() == car.getEngine().getSize();
  }
}
