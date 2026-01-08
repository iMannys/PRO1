public class EmployeeList
{
  private int size;
  private Employee[] employees;

  public EmployeeList(int maxNumberOfEmployees)
  {
    this.employees=new Employee[maxNumberOfEmployees];
    this.size=0;
  }

  public void addEmployee(Employee employee)
  {
    employees[size]=employee;
    size++;
  }

  public void removeEmployee(Employee employee)
  {
    for(int i=0;i<size;i++)
    {
     if(employees[i].equals(employee))
     {
       employees[i]=employees[size-1];
       employees[size-1]=null;
       size--;
     }
    }
  }


}
