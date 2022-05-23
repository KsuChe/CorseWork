public class Employee {
    String firstName;
    String surname;
    String secondName;
    int department;
    int salary;

    public Employee(String firstName, String surname, String secondName, int department, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this. secondName = secondName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return  secondName;
    }

    public String getSurname() {
        return surname;
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

}
