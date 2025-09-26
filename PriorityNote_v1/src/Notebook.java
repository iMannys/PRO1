public class Notebook
{
  private int size;
  private PriorityNote[] notes;

  public Notebook(int capacity)
  {
    this.size = 0;
    this.notes = new PriorityNote[capacity];
  }

  public int getSize()
  {
    return size;
  }

  public void addNote(PriorityNote note)
  {
    notes[size] = note.copy();
    size++;
  }

  public void addNote(String note)
  {
    notes[size] = new PriorityNote(note);
    size++;
  }

  public void addHighPriorityNote(String note)
  {
    notes[size] = new PriorityNote(note);
    notes[size].setHighPriority();
    size++;
  }

  public boolean isHighPriorityNote(int index)
  {
    if (index >= 0 && index <= size - 1)
    {
      return notes[index].isHighPriority();
    }
    return false;
  }

  public int indexOfMostImportantNote()
  {
    for (int i = 0; i < size; i++)
    {
      if (isHighPriorityNote(i))
      {
        return i;
      }
    }
    if (size > 0)
    {
      return 0;
    }
    return -1;
  }

  public String getMostImportantNote()
  {
    int index = indexOfMostImportantNote();
    if (index > -1)
    {
      return notes[index].getNote();
    }
    return null;
  }

  public void removeNote(int index)
  {
    for (int i = index; i < size - 1; i++) // Account for out of bounds error
    {
      notes[i] = notes[i + 1]; // Set index to next index
    }
    notes[size - 1] = null; // Size is always one more than the last index
    size--;
  }

  public String toString()
  {
    String s = "";
    for (int i = 0; i < size; i++)
    {
      s += "Note #" + (i + 1) + ": " + notes[i]; // notes[i] == tostring
      if (i < size - 1)
      {
        s += "\n";
      }
    }
    return s;
  }
}
