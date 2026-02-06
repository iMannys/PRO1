import java.util.Random;

public class PrintUser implements Runnable
{
  private PrintServer printServer;
  private String username;

  public PrintUser(PrintServer printServer, String username)
  {
    this.printServer = printServer;
    this.username = username;
  }

  @Override public void run()
  {
    Random random = new Random();
    for (int i = 0; i < 5; i++)
    {
      int pages = random.nextInt(8)+1;
      PrintJob job = new PrintJob(username, pages);
      printServer.submitJob(job);
      try
      {
        int wait = random.nextInt(3500, 10000);
        Thread.sleep(wait);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
  }
}
