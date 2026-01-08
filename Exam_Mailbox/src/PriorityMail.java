public class PriorityMail extends Mail
{
  private boolean highPriority;

  public PriorityMail(boolean highPriority, String subject, String content,
      Date date, MailAccount from)
  {
    super(subject, content, date, from);
    this.highPriority = highPriority;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }
}
