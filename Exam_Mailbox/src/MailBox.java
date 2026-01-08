import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class MailBox
{
  private ArrayList<Mail> mails;

  public MailBox()
  {
    this.mails = new ArrayList<>();
  }

  public int getNumberOfMails()
  {
    return mails.size();
  }

  public void createMail(Mail mail)
  {
    mails.add(mail);
  }

  public ArrayList<Mail> getBySubject(String subject)
  {
    ArrayList<Mail> mailsBySubject = new ArrayList<>();
    for (int i = 0; i < mails.size(); i++)
    {
      if (mails.get(i).getSubject().equals(subject))
      {
        mailsBySubject.add(mails.get(i));
      }
    }
    return mailsBySubject;
  }

  public ArrayList<String> getSubjectsFromUser(String user)
  {
    ArrayList<String> subjects = new ArrayList<>();

    for (int i = 0; i < mails.size(); i++)
    {
      if (mails.get(i).getFromAccount().getUser().equals(user))
      {
        subjects.add(mails.get(i).getSubject());
      }
    }

    return subjects;
  }

  public ArrayList<MailAccount> getAllFromAccounts()
  {
    ArrayList<MailAccount> fromAccounts = new ArrayList<>();

    for (int i = 0; i < mails.size(); i++)
    {
      fromAccounts.add(mails.get(i).getFromAccount());
    }

    return fromAccounts;
  }

  public ArrayList<Mail> getAllNonSendEmails()
  {
    ArrayList<Mail> nonSendMails = new ArrayList<>();

    for (int i = 0; i < mails.size(); i++)
    {
      if (!mails.get(i).hasBeenSend())
      {
        nonSendMails.add(mails.get(i));
      }
    }
    return nonSendMails;
  }

  public ArrayList<PriorityMail> getAllHighPriorityMails()
  {
    ArrayList<PriorityMail> highPriorityMails = new ArrayList<>();

    for (int i = 0; i < mails.size(); i++)
    {
      if (mails.get(i) instanceof PriorityMail priorityMail)
      {
        if (priorityMail.isHighPriority())
        {
          highPriorityMails.add(priorityMail);
        }
      }
    }
    return highPriorityMails;
  }
}
