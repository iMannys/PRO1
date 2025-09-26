public class JobTest
{
  // Fancy colors
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";

  public static void main(String[] args)
  {
    Person jason = new Person('M', "Jason Thor Hall", 47);
    Person jane = new Person('F', "Jane Doe", 47);

    Job job1 = new Job("Blizzard QA Tester", 47565.50, jason);
    Job job2 = new Job("Software Engineer", 45723.25);

    System.out.println(ANSI_GREEN + "Here are some jobs: " + ANSI_RESET);
    System.out.println();

    System.out.println(ANSI_GREEN + "Job 1:" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + job1.getTitle() + ANSI_RESET);

    System.out.println();

    System.out.println(ANSI_GREEN + "Job 2:" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + job2.getTitle() + ANSI_RESET);

    System.out.println();

    System.out.println(ANSI_GREEN + "Is job1 available: " + ANSI_PURPLE + job1.isAvailable() + ANSI_RESET);
    System.out.println(ANSI_GREEN + "Is job2 available: " + ANSI_PURPLE + job2.isAvailable() + ANSI_RESET);

    System.out.println();

    System.out.println(ANSI_CYAN + "Jane would like some info on job 2" + ANSI_RESET);

    System.out.println();

    System.out.println(ANSI_GREEN + "Job title: " + ANSI_RED + job2.getTitle());
    System.out.println(ANSI_GREEN + "Salary: " + ANSI_RED + job2.getSalary());
    System.out.println(ANSI_GREEN + "Employee: " + ANSI_RED + job2.getEmployee() + ANSI_RESET);

    System.out.println();

    System.out.println(ANSI_CYAN + "Jane applies for job 2" + ANSI_RESET);

    System.out.println(". . .");

    job2.hire(jane);

    System.out.println(ANSI_CYAN + "She got the job" + ANSI_RESET);

    System.out.println(". . .");

    System.out.println(ANSI_CYAN + "She got a 500 DKK raise for working hard" + ANSI_RESET);

    job2.setSalary(job2.getSalary() + 500);
    System.out.println(ANSI_GREEN + "New salary: " + ANSI_RED + job2.getSalary() + ANSI_RESET);

    System.out.println();

    job1.fire();

    System.out.println(ANSI_CYAN + "Jason from job 1 got fired for looking at Reddit instead of working" + ANSI_RESET);

    System.out.println(ANSI_GREEN + "\nData on the two jobs:\n" + ANSI_RESET);

    System.out.println(ANSI_GREEN + "Job 1:" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + job1 + ANSI_RESET);

    System.out.println();

    System.out.println(ANSI_GREEN + "Job 2:" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + job2 + ANSI_RESET);

    System.out.println();

    boolean isJobsEqual = job1.equals(job2);

    System.out.println(ANSI_GREEN + "Is Blizzard QA Tester equal to Software Engineer: " + isJobsEqual + ANSI_RESET);
  }
}
