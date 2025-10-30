import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
  private ArrayList<Child> children;

  public Kindergarten()
  {
    this.countTeachers = 0;
    this.children = new ArrayList<>();
  }

  public void addChild(Child child)
  {
    children.add(child);
  }

  public void removeChild(Child child)
  {
    children.remove(child);
  }

  public void hireTeachers(int count)
  {
    countTeachers += count;
  }

  public void fireTeacher()
  {
    countTeachers--;
  }

  public int countChildren()
  {
    return children.size();
  }

  public int countTeachers()
  {
    return countTeachers;
  }

  public double getAverageChildAge()
  {
    int allAges = 0;
    for (int i = 0; i < children.size(); i++)
    {
      allAges += children.get(i).getAge();
    }
    return (double) allAges / children.size();
  }

  public double getNorm()
  {
    return (double) children.size() / countTeachers;
  }

  public void celebrateBirthday(String name)
  {
    for (int i = 0; i < children.size(); i++)
    {
      Child child = children.get(i);
      if (child.getName().equals(name))
      {
        int newAge = child.getAge() + 1;
        child.setAge(newAge);
        break;
      }
    }
  }

  @Override public String toString()
  {
    return "Teacher count: " + countTeachers + "\nChildren: " + children.size();
  }
}
