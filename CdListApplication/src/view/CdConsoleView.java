package view;

import model.CdModel;

import java.util.Scanner;

public class CdConsoleView
{
  private CdModel model;

  public CdConsoleView(CdModel model)
  {
    this.model = model;
  }

  public void start()
  {
    boolean isRunning = true;
    while (isRunning)
    {

      System.out.println("1) Get CD by index");
      System.out.println("2) Get CDs by title");
      System.out.println("3) Get number of CDs");
      System.out.println("4) Add a new CD");
      System.out.println("5) Remove first CD by title");
      System.out.println("6) Clear all CDs");
      System.out.println("0) Exit");

      Scanner input = new Scanner(System.in);
      System.out.println("Choose your action:");

      int choice = input.nextInt();

      input.nextLine();

      switch (choice)
      {
        case 1:
          System.out.println("Index?");
          int index = input.nextInt();
          System.out.println(model.getCd(index));;
          break;
        case 2:
        {
          System.out.println("Title?");
          String title = input.nextLine();
          System.out.println(model.getCdsByTitle(title));
          break;
        }
        case 3:
          System.out.println(model.getNumberOfCds());
          break;
        case 4:
          System.out.println("Not implemented");
          break;
        case 5:
        {
          System.out.println("Title?");
          String title = input.nextLine();
          model.removeFirstCdByTitle(title);
          break;
        }
        case 6:
          model.clear();
          break;
        case 0:
          isRunning = false;
          break;
      }

    }



  }
}
