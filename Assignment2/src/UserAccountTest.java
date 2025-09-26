import java.util.Scanner;

public class UserAccountTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = input.nextLine();

    System.out.println("What is your username?");
    String username = input.nextLine();

    String password = UserAccount.readPassword();

    UserAccount userAcc = new UserAccount(name, username, password);

    System.out.println();
    System.out.println("You are now changing your password.");

    String newPassword = UserAccount.readPassword();

    userAcc.setPassword(newPassword);

    System.out.println("Your password is NotSecure: " + userAcc.hasPassword("NotSecure"));

    UserAccount userAcc2 = new UserAccount("John Doe", "JohnDoe123", "MrDoe");

    System.out.println("Johns account is equal to yours: " + userAcc.equals(userAcc2));
  }
}
