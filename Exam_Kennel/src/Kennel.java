import java.util.ArrayList;

public class Kennel
{
  private Person owner;
  private ArrayList<Pet> pets;

  public Kennel(Person owner)
  {
    if(owner == null)
    {
      throw new IllegalArgumentException("Owner cannot be null");
    }
    this.owner = owner;
    this.pets = new ArrayList<>();
  }

  public void sellTo(Person newOwner)
  {
    this.owner = newOwner;
  }

  public void addPet(Pet pet)
  {
    pets.add(pet);
  }

  public Pet hasPet(String id)
  {
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i).getId().equals(id))
      {
        return pets.get(i);
      }
    }
    return null;
  }

  public Pet sellPet(String id)
  {
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i).getId().equals(id))
      {
        return pets.remove(i);
      }
    }
    return null;
  }

  public ArrayList<Pet> getPetsByBirthDate(int year, int month)
  {
    ArrayList<Pet> petsByBirthDate = new ArrayList<>();

    for (int i = 0; i < pets.size(); i++)
    {
      Date birthDate = pets.get(i).getBirthDate();
      if (birthDate.getYear() == year && birthDate.getMonth() == month)
      {
        petsByBirthDate.add(pets.get(i));
      }
    }

    return petsByBirthDate;
  }

  public boolean isAPureDogKennel()
  {
    for (int i = 0; i < pets.size(); i++)
    {
      if (!pets.get(i).getSpecies().equals("Dog"))
      {
        return false;
      }
    }
    return true;
  }

  public Cat getAChippedCat()
  {
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i) instanceof Cat cat)
      {
        if (cat.isChipped())
        {
          return cat;
        }
      }
    }
    return null;
  }

  public ArrayList<String> getIdsBySpecies(String species)
  {
    ArrayList<String> ids = new ArrayList<>();

    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i).getSpecies().equals(species))
      {
        ids.add(pets.get(i).getId());
      }
    }
    return ids;
  }

  public Dog[] getDogsByBirth(int year)
  {
    ArrayList<Dog> dogs = new ArrayList<>();
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i) instanceof Dog dog)
      {
        if (dog.getBirthDate().getYear() == year)
        {
          dogs.add(dog);
        }
      }
    }

    Dog[] dogArray = new Dog[dogs.size()];
    dogArray = dogs.toArray(dogArray);

    return dogArray;
  }

}
