import java.util.ArrayList;

public class Person
{
  private String name;
  private ArrayList<Car> cars;
  private SportsCar sportsCar;

  public Person(String name)
  {
    this.name = name;
    this.cars = new ArrayList<>();
    this.sportsCar = null;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfCarsOwned()
  {
    return cars.size();
  }

  public void buyACar(Car car)
  {
    cars.add(car);
  }

  public void sellACar(Car car)
  {
    cars.remove(car);
  }

  public void registerAsSportsCarDriver(SportsCar car)
  {
    this.sportsCar = car;
  }

  public boolean doYouOwnTheSportsCarYouDrive()
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i) instanceof SportsCar sportsCar)
      {
        return this.sportsCar.equals(sportsCar);
      }
    }
    return false;
  }

  public void sellTheOldestCar()
  {
    if (cars.isEmpty()) return;
    Car currentCar = cars.get(0);

    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getYear() < currentCar.getYear())
      {
        currentCar = cars.get(i);
      }
    }

    sellACar(currentCar);
  }

  public Car getOwnedCarWithLargestEngine()
  {
    if (cars.isEmpty()) return null;

    Car currentCar = cars.get(0);

    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getEngine().getSize() > currentCar.getEngine().getSize())
      {
        currentCar = cars.get(i);
      }
    }

    return currentCar;
  }

  public ArrayList<SportsCar> getAllSportsCarOwned()
  {
    ArrayList<SportsCar> sportsCars = new ArrayList<>();

    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i) instanceof SportsCar sportsCar)
      {
        sportsCars.add(sportsCar);
      }
    }

    return sportsCars;
  }
}
