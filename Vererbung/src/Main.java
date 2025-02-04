public class Main {
    public static void main(String[] args) {
        Employee ceo = new Employee("Khawari","Negin", 45, 18);
        Employee cto = new Employee("Batschuluun","Maral",34, 20);
        Supervisor supervisor=new Supervisor("Sengwein","Mario",123,39,1234,444);

        System.out.println(ceo.printAll());
        System.out.println(cto.printAll());

        System.out.println("\nBefore salary increase:");
        System.out.println(supervisor.printAll());

        // Gehaltserhöhung von 10%
        supervisor.salaryIncrease(10);

        // Ausgabe nach der Gehaltserhöhung
        System.out.println("\nAfter salary increase:");
        System.out.println(supervisor.printAll());

    }
}