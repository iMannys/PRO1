public class Main
{
  public static void main(String[] args)
  {
    PrintServer printServer = new PrintServer();

    new Thread(printServer).start();

    Thread[] printUsers = {
        new Thread(new PrintUser(printServer, "Kasper")),
        new Thread(new PrintUser(printServer, "Anna")),
        new Thread(new PrintUser(printServer, "Mikkel")),
        new Thread(new PrintUser(printServer, "Sofie")),
        new Thread(new PrintUser(printServer, "Jonas"))
    };

    for (Thread printUserThread : printUsers)
    {
      printUserThread.start();
    }
  }
}
