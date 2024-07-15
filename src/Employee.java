import java.util.Objects;


public class Employee {
    private String firstName;
    private String secondName;
    private String thirdName;
    private int department;
    private int salary;
    private static int counter = 0;
    private int id;

    public Employee(String firstName, String secondName, String thirdName, int department, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String toString() {
        return String.format("Employee: firstName - %s, secondName - %s, thirdName - %s, department - %s, salary - %s", firstName, secondName, thirdName, department, salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public int setDepartment(int department) {
        this.department = department;
        return department;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }
    public int hashCode() {
        return Objects.hash(firstName, secondName, thirdName, department, salary);
    }
    public boolean equals(Object a) {
        if (this == a){
            return true;
        }
        if (a == null || this.getClass() != a.getClass()){
            return false;
        }
        Employee employee = (Employee) a;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.firstName) && Objects.equals(thirdName, employee.thirdName) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary);
    }

}

