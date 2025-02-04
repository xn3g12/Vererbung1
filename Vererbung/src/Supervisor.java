public class Supervisor extends Employee{
    private int supervisorID;
    private float salary;

    public int getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(int supervisorID) {
        this.supervisorID = supervisorID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public Supervisor(String ln, String fn, int EmpId, int a,int supervisorId,float salary1) {
        super(ln, fn,EmpId,a);
        supervisorID=supervisorId;
        salary=salary1;
        age=a;
    }
        // Methode zur Gehaltserhöhung
    public void salaryIncrease(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }
    @Override
    public String printAll() {
        return super.printAll() + ", Supervisor ID: " + supervisorID + ", Salary: " + salary;
    }
}
