public class Employee extends Person {
    private int employeeId;


    public Employee() {
    }
    public Employee(String ln, String fn, int EmpId, int a) {
        super(ln, fn); // Java ruft hier den Konstruktor der Oberklasse auf//super extens klasse
        employeeId = EmpId;
        age = a;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String printAll() {
        return fullName() + ", Employee ID: " + employeeId + ", Age: " + age;
    }
}
