public class Person {
    private String firstName;       //create a attribut or a variable
    private  String name;
    public int age;

    public Person() {               //default Constructor
    }
    public Person(String fn, String ln) {
        firstName = fn;
        name = ln;
    }

    public void setName(String ln, String fn) {
        this.name = name;   //eindeutige auf variabel
    }

    public String fullName() {
        return name + " " + firstName;
    }
}

