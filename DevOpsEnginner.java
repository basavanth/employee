public class DevOpsEngineer extends Employee {
    private double bonus;
    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
    super(name, employeeId, salary);
    this.bonus = bonus;
    }
    public double getBonus() {
    return bonus;
    }
    @Override
    public double getSalary() {
    return super.getSalary() + bonus;
    }
    @Override
    public void displayDetails() {
    super.displayDetails();
    System.out.println(&quot;Bonus: $&quot; + bonus);
    System.out.println(&quot;Total Salary: $&quot; + getSalary());
    }
    }

