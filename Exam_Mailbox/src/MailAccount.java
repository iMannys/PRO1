public class MailAccount
{
  private String user;
  private String email;

  public MailAccount(String user, String email)
  {
    this.user = user;
    this.email = email;
  }

  public String getUser()
  {
    return user;
  }

  public String email()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public static boolean isValidEmail(String email)
  {
    if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
    {
      return true;
    }
    return false;
  }
}
