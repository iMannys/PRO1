public class PrintJob
{
  private String jobId;
  private String username;
  private int numberOfPages;


  public PrintJob(String username, int numberOfPages)
  {
    this.jobId = "";
    this.username = username;
    this.numberOfPages = numberOfPages;
  }

  public int getNumberOfPages()
  {
    return numberOfPages;
  }

  public void setJobId(String jobId)
  {
    this.jobId = jobId;
  }

  @Override public String toString()
  {
    return "JobId: " + jobId + " Username: " + username + " Pages: " + numberOfPages;
  }
}
