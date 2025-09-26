import java.util.Scanner;

public class UserAccount
{
  private String name;
  private String username;
  private String password;

  public UserAccount(String name, String username, String password)
  {
    this.name = name;
    this.username = username;
    this.password = password;
  }

  public String getName()
  {
    return name;
  }

  public String getUsername()
  {
    return username;
  }

  public boolean hasPassword(String otherPassword)
  {
    return password.equals(otherPassword);
  }

  public void setPassword(String newPassword)
  {
    this.password = newPassword;
  }

  public static String readPassword()
  {
    Scanner input = new Scanner(System.in);

    String password = "";
    String repeatPassword = "";

    do
    {
      System.out.println("What is your password?");
      password = input.nextLine();

      if (password.isEmpty())
      {
        System.out.println("Password is empty, try again!");
        continue;
      }

      System.out.println("Input your password again");
      repeatPassword = input.nextLine();

      if (!password.equals(repeatPassword))
      {
        System.out.println("Wrong password, try again!");
      }
    } while (!password.equals(repeatPassword) && !password.isEmpty());

    return password;
  }

  @Override public String toString()
  {
    return "Name: " + name +
        "\nUsername: " + username;
  }

  @Override public boolean equals(Object obj)
  {
    if (obj != null && getClass() != obj.getClass())
    {
      return false;
    }
    UserAccount userAcc = (UserAccount) obj;
    return name.equals(userAcc.name) &&
        username.equals(userAcc.username) &&
        password.equals(userAcc.password);
  }


}
