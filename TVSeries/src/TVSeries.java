import java.util.ArrayList;

public class TVSeries
{
  private String title;
  private int numberOfEpisodes;
  private ArrayList<Actor> actors;

  public TVSeries(String title)
  {
    this.title = title;
    this.numberOfEpisodes = 0;
    this.actors = new ArrayList<>();
  }

  public void hireActor(Actor actor)
  {
    actors.add(actor);
  }

  public int getNumberOfActors()
  {
    return actors.size();
  }

  public Actor getActor(int index)
  {
    return actors.get(index);
  }

  public void awardEmmy(String name)
  {
    for (int i = 0; i < actors.size(); i++)
    {
      Actor actor = actors.get(i);
      if (actor.getName().equals(name))
      {
        actor.awardEmmy();
        break;
      }
    }
  }

  public void makeNextEpisode()
  {
    numberOfEpisodes++;
    for (int i = 0; i < actors.size(); i++)
    {
      actors.get(i).participateInEpisode();
    }
  }

  public ArrayList<Actor> getEmmyWinners()
  {
    ArrayList<Actor> emmyWinners = new ArrayList<>();
    for (int i = 0; i < actors.size(); i++)
    {
      Actor actor = actors.get(i);
      if (actor.getNumberOfEmmys() > 0)
      {
        emmyWinners.add(actor);
      }
    }
    return emmyWinners;
  }

  @Override public String toString()
  {
    return "Title: " + title
        + "\nEpisodes: " + numberOfEpisodes
        + "\nActors: " + actors;
  }
}
