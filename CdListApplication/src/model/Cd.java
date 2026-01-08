package model;

public class Cd
{
  private String title;
  private String artist;
  private Song[] songs;

  public Cd(String title, String artist, Song[] songs)
  {
    this.title = title;
    this.artist = artist;
    this.songs = songs;
  }

  public String getTitle()
  {
    return title;
  }

  public String getArtist()
  {
    return artist;
  }

  public Time getLength()
  {
    int allSeconds = 0;
    for (int i=0; i < songs.length; i++)
    {
      Time length = songs[i].getLength();
      allSeconds += length.getTimeInSeconds();
    }
    return new Time(allSeconds);
  }

  public Song getSong(int index)
  {
    if (index < songs.length)
    {
      return songs[index];
    }
    return null;
  }

  public int getNumberOfSongs()
  {
    return songs.length;
  }

  @Override public String toString()
  {
    String s = "Cd: ";
    for (int i=0; i < songs.length; i++)
    {
      s += songs[i].toString();
      if (i != songs.length-1)
      {
        s += "\n";
      }
    }
    return s;
  }
}