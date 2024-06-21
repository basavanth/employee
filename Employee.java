public class Employee {
    private String name;
    private int employeeId;
    private double salary;
    public Employee(String name, int employeeId, double salary) {
    this.name = name;
    this.employeeId = employeeId;
    this.salary = salary;
    }
    public String getName() {
    return name;
    }
    public int getEmployeeId() {
    return employeeId;
    }
    public double getSalary() {
    return salary;
    }
    public void displayDetails() {
    System.out.println(&quot;Employee Name: &quot; + name);
    System.out.println(&quot;Employee ID: &quot; + employeeId);
    System.out.println(&quot;Salary: $&quot; + salary);
    }
    public static void main(String[] args) {
    
    Employee emp = new Employee(&quot;Amit&quot;, 1001, 50000.0);
    emp.displayDetails();
    DevOpsEngineer devOps = new DevOpsEngineer(&quot;Arun&quot;, 1002, 60000.0, 5000.0);
    devOps.displayDetails();
    System.out.println();
    }
    }