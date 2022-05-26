public class Employee {
    private String Name;
    private int department;
    private int salary;
    private int id;
    private static int idCounter = 0;

    public Employee(String Name, int department, int salary) {
        id = idCounter++;
        this.Name = Name;
        this.department = department;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " ФИО " + this.Name + " департамент " + this.department + " зарплата " + this.salary;
    }
}
