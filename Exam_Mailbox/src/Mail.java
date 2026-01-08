public class Mail
{
  private String subject;
  private String content;
  private MailAccount fromAccount;
  private MailAccount toAccount;
  private Date date;

  public Mail(String subject, String content, Date date,
      MailAccount fromAccount)
  {
    this.subject = subject;
    this.content = content;
    this.date = date.copy();
    this.fromAccount = fromAccount;
    this.toAccount = null;
  }

  public void sendTo(MailAccount toAccount)
  {
    this.toAccount = toAccount;
  }

  public boolean hasBeenSend()
  {
    return toAccount != null;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public String getSubject()
  {
    return subject;
  }

  public String getContent()
  {
    return content;
  }

  public MailAccount getFromAccount()
  {
    return fromAccount;
  }

  public MailAccount getToAccount()
  {
    return toAccount;
  }
}
