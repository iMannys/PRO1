import java.util.ArrayDeque;

public class PrintServer implements Runnable
{
  private ArrayDeque<PrintJob> queue;
  private boolean isRunning;

  public PrintServer()
  {
    this.queue = new ArrayDeque<>();
    this.isRunning = true;
  }

  public synchronized void submitJob(PrintJob job)
  {
    job.setJobId("J" + queue.size());
    queue.addLast(job);
    for (PrintJob printJob : queue)
    {
      System.out.println(printJob);
    }
    notifyAll();
  }

  public synchronized void printNext()
  {
    while (queue.isEmpty())
    {
      try
      {
        System.out.println("Waiting to print");
        wait();
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    PrintJob job = queue.removeFirst();
    System.out.println(job);
    try
    {
      Thread.sleep(job.getNumberOfPages() * 1000L); // 1000 long
    }
    catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }
  }

  public synchronized void stop()
  {
    this.isRunning = false;
  }

  @Override public void run()
  {
    while (isRunning)
    {
      printNext();
    }
  }
}
