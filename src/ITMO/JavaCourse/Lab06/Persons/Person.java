package ITMO.JavaCourse.Lab06.Persons;

public abstract class Person implements Interface {
    private String name;
    private String lastname;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public abstract void getInfo();
}
